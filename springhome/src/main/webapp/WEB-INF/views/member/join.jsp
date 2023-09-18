<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<script src="/js/memberJoin.js"></script>

<body>
    <form action="join" method="post" autocomplete="off" onsubmit="return checkForm();">
        <div class="container w-500">
            <div class="row">
                <h2 style="color:#FA5882">회원가입</h2>
            </div>

            <div class="row left">
                <div class="row left">
                    <label>아이디<i class="fa-solid fa-asterisk red"></i></label>
                    <input class="form-input w-100" type="text" name="memberId" placeholder="영문 소문자, 숫자 5~20자" onblur="checkMemberId();">
                    <div class="success-feedback">멋진 아이디입니다!</div>
                    <div class="fail-feedback">사용할 수 없는 아이디입니다</div>
                    <div class="fail2-feedback">이미 사용 중인 아이디입니다</div>
                </div>
                <div class="row left">
                    <label>비밀번호<i class="fa-solid fa-asterisk red"></i></label>
                    <input class="form-input w-100" type="password" name="memberPw" placeholder="영문, 숫자, 특수문자 포함 8~16자" onblur="checkMemberPw();">
                    <div class="success-feedback">사용 가능한 비밀번호입니다</div>
                    <div class="fail-feedback">사용할 수 없는 비밀번호입니다</div>
                </div>
                <div class="row left">
                    <label>비밀번호 확인<i class="fa-solid fa-asterisk red"></i></label>
                    <input class="form-input w-100" type="password" id="password-check" onblur="checkMemberPw2();">
                    <div class="success-feedback">비밀번호가 일치합니다</div>
                    <div class="fail-feedback">비밀번호가 일치하지 않습니다</div>
                    <div class="fail2-feedback">비밀번호를 먼저 작성해주세요</div>
                </div>
                <div class="row left">
                    <label>닉네임<i class="fa-solid fa-asterisk red"></i></label>
                    <input class="form-input w-100" type="text" name="memberNickname" placeholder="한글 또는 숫자 2~10자" onblur="checkMemberNickname();">
                    <div class="success-feedback">멋진 닉네임입니다</div>
                    <div class="fail-feedback">사용할 수 없는 닉네임입니다</div>
                    <div class="fail2-feedback">이미 사용 중인 닉네임입니다</div>
                </div>
                <div class="row left">
                    <label>이메일</label>
                    <input class="form-input w-100" type="text" name="memberEmail" onblur="checkMemberEmail();">
                    <div class="fail-feedback">형식에 맞지 않습니다</div>
                </div>
                <div class="row left">
                    <label>전화번호</label>
                    <input class="form-input w-100" type="tel" name="memberContact" placeholder="- 제외" onblur="checkMemberContact();">
                    <div class="fail-feedback">형식에 맞지 않습니다</div>
                </div>
                <div class="row left">
                    <label>생년월일</label>
                    <input class="form-input w-100" type="date" name="memberBirth" onblur="checkMemberBirth();">
                    <div class="fail-feedback">잘못된 날짜입니다</div>
                </div>
                <div class="row left">
                    <label>주소</label>
                </div>
                <div class="row left">
                    <input class="form-input" type="text" name="memberPost" placeholder="우편번호" maxlength="6" onblur="checkMemberAddress();">
                    <button class="btn" type="button"><i class="fa-solid fa-magnifying-glass" style="color: #ffb6c1;;"></i></button>
                    <input class="form-input w-100 mt-10" type="text" name="memberAddr1" placeholder="기본주소" onblur="checkMemberAddress();">
                    <input class="form-input w-100 mt-10" type="text" name="memberAddr1" placeholder="상세주소" onblur="checkMemberAddress();">
                    <div class="fail-feedback">주소를 모두 작성해주세요</div>
                </div>
                <div class="row left">
                    <button class="btn btn-positive w-100" style="background-color: #ffb6c1; border-color: #ffb6c1;">가입하기</button>
                </div>
                
            </div>
        </div>
    </form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
