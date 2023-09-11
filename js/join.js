$(function(){
    var status = {
        id:false,
        pw:false,
        checkPw:false,
        nickname:false,
        email:false,
        contact:false,
        birth:false,
        post:false,

        ok:function(){
            return this.id && this.pw && this.checkPw && this.nickname && this.email
                        && this.contact && this.birth && this.post;
        },
    };

    $("[name=memberId]").blur(function(e){
        var Regex = /^[a-z][a-z0-9]{4,19}$/;
        var isValid = Regex.test($(e.target).val());

        
        if(isValid){//형식이 유효하다면
            $.ajax({
                url:"http://localhost:8080/rest/member/idCheck",
                method:"post",
                data:{memberId : $(e.target).val()},
                success: function(response){
                    $(e.target).removeClass("success fail fail2");
                    if(response == "Y"){//사용 가능
                        $(e.target).addClass("success");
                        status.memberId = true;
                    }else{//사용 불가 (중복)
                        $(e.target).addClass("fail2");
                        status.memberId = false;
                    }
                },
                error:function(){//사용 불가(중복)
                    alert("서버와의 통신이 원활하지 않습니다");
                },
            });
        }else{//형식이 유효하지 않는다면
            $(e.target).addClass("fail");
            status.memberId = false;
        }
    });

    $("[name=memberPw]").blur(function(e){
        var Regex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$/;
        var isValid = Regex.test($(this).val());

        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail");

        status.pw = isValid;
    });

    $("[name=checkPw]").blur(function(){
        var originPw = $("[name=memberPw]").val();
        var checkPw = $(this).val();

        $(this).removeClass("success fail fail2");
        if(originPw.length == 0){
            $(this).addClass("fail2");
            status.checkPw = false;
        }else if(originPw == checkPw){
            $(this).addClass("success");
            status.checkPw = true;
        }else{
            $(this).addClass("fail");
            status.checkPw = false;
        }
    });

    $("[name=memberNickname]").blur(function(e){
        var Regex = /^[가-힣0-9]{2,10}$/;
        var isValid = Regex.test($(e.target).val());

        
        if(isValid){//형식이 유효하다면
            $.ajax({
                url:"http://localhost:8080/rest/member/nicknameCheck",
                method:"post",
                data:{memberNickname : $(e.target).val()},
                success:function(response){
                    $(e.target).removeClass("success fail fail2");
                    if(response == "Y"){//사용 가능
                        $(e.target).addClass("success");
                        status.memberNickname = true;
                    }else{//사용 불가(중복)
                        $(e.target).addClass("fail2");
                        status.memberNickname = false;
                    }
                },
                error:function(){
                    alert("서버와의 통신이 원활하지 않습니다");
                },
            });
        }else{//형식이 유효하지 않는다면
            $(e.target).addClass("fail");
            status.memberNickname = false;
        }
        
    });

    $("[name=memberEmail]").blur(function(){
        var Regex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9!@#$]{8,16}$/;
        var isValid = (Regex.test($(this).val())) || ($(this).val().length == 0);

        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail");

        status.email = isValid;
    });

    $("[name=memberContact]").blur(function(){
        var Regex = /^010[1-9][0-9]{7}$/;
        var isValid = (Regex.test($(this).val()) || ($(this).val().length == 0));

        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail");

        status.contact = isValid;
    });

    $("[name=memberBirth]").blur(function(){
        var Regex = /^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-/;
        var isValid = (Regex.test($(this).val())) || ($(this).val().length == 0);

        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail");

        status.birth = isValid;
    });

    $("[name=memberPost]").blur(function(){
        var post = $(this).val();
        var addr1 = $("[name=memberAddr1]").val();
        var addr2 = $("[name=memberAddr2]").val();

        var isBlank = post.length == 0 && addr1 == 0 && addr2 == 0;
        var isFill = post.length > 0 && addr1 > 0 && addr2 == 0;
        var isValid = isBlank || isFill;

        $(this).removeClass("success fail");
        $("[name=memberAddr1]").removeClass("success fail");
        $("[name=memberAddr2]").removeClass("success fail");
        
        $(this).addClass(isValid ? "success" : "fail");
        $("[name=memberAddr1]").addClass(isValid ? "success" : "fail");
        $("[name=memberAddr2]").addClass(isValid ? "success" : "fail");

        status.post = isValid;
    });
    
    $(".join-form").submit(function(e){
        console.table(status);

        if(status.ok() == false){
            e.preventDefault();
        }
    });
});