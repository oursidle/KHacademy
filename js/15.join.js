function checkMemberId(){
    var input = document.querySelector("[name=memberId]");
    var regex = /^[a-z0-9]{5,20}$/;

    var isValid = regex.test(input.value);

    input.classList.remove("success", "fail", "fail2");
    if(isValid){
        input.classList.add("success");
        return true;
    }else{
        input.classList.add("fail");
        return false;
    }
}

function checkMemberPw(){
    var input = document.querySelector("[name=memberPw]");
    var regex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9!@#$]{8,16}$/;

    var isValid = regex.test(input.value);

    input.classList.remove("success", "fail");
    input.classList.add(isValid ? "success" : "fail");

    return isValid;
}

function checkMemberPw2(){
    var input1 = document.querySelector("[name=memberPw]");
    var input2 = document.querySelector("#password-check");

    input2.classList.remove("success", "fail", "fail2");
    if(input1.value.length == 0){//비밀번호 미작성
        input2.classList.add("fail2");
        return false;
    }else if(input1.value == input2.value){//비밀번호 검사
        input2.classList.add("success");
        return true;
    }else{//비밀번호 불일치
        input2.classList.add("fail");
        return false;
    }
    
}

function checkMemberNickname(){
    var input = document.querySelector("[name=memberNickname]");
    //var regex = /^[가-힣0-9]{2,10}$/;
    var regex = /^[ㄱ-하-ㅣ가-힣0-9]{2,10}/;//자음, 모음 가능

    var isValid = regex.test(input.value);

    input.classList.remove("success", "fail", "fail2");
    if(isValid){
        //+중복 검사(추후)
        input.classList.add("success");
        return true;
    }else{
        input.classList.add("fail");
        return false;
    }
}

function checkMemberEmail(){
    var input = document.querySelector("[name=memberEmail]");
    var regex = /^(.*?)@(.*?)$/;

    var isValid = input.value.length == 0 || regex.test(input.value);//입력값이 0이 아니거나 정규표현식에 맞거나

    input.classList.remove("success", "fail");
    input.classList.add(isValid ? "success" : "fail");
    return isValid
}

function checkMemberContact(){
    var input = document.querySelector("[name=memberContact]");
    var regex = /^010[1-9][0-9]{7}$/;

    var isValid = input.value.length == 0 || regex.test(input.value);//입력값이 0이 아니거나 정규표현식에 맞거나

    input.classList.remove("success", "faile");
    input.classList.add(isValid ? "success" : "fail");
    return isValid;
}

function checkMemberBirth(){
    var input = /^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-/;

    var isValid = input.value.length == 0 || regex.test(input.value);

    input.classList.remove("success", "fail");
    input.classList.add(isValid ? "success" : "fail");
    return true;
}

function checkMemberAddress(){
    var input1 = document.querySelector("[name=memberPost]");
    var input2 = document.querySelector("[name=memberAddr1]");
    var input3 = document.querySelector("[name=memberAddr2]");

    var isBlank = inpu1.value.length == 0 && inpu2.value.length == 0 && inpu3.value.length == 0;
    var isFill = inpu1.value.length > 0 && inpu2.value.length > 0 && inpu3.value.length > 0;
    var isValid = isBlank || isFill;

    input1.classList.remove("success", "fail");
    input2.classList.remove("success", "fail");
    input3.classList.remove("success", "fail");

    input1.classList.add(isValid ? "success" : "fail");
    input2.classList.add(isValid ? "success" : "fail");
    input3.classList.add(isValid ? "success" : "fail");

    return isValid;
}

function checkForm(){
    var result1 = checkMemberId();
    var result2 = checkMemberPw();
    var result3 = checkMemberPw2();
    var result4 = checkMemberNickname();
    var result5 = checkMemberEmail();
    var result6 = checkMemberBirth();
    var result7 = checkMemberContact();
    var result8 = checkMemberAddress();

    return result1 && result2 && reuslt3 && reuslt4 && reuslt5 && reuslt6 && result7 && result8;
}