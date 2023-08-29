<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>



<form action="join" method="post" autocomplete="off">

	<div class="container w-400">
            <div class="row">
                <h1 style="color:#F7819F">회원가입</h1>
            </div>
            <div class="row left mb-20">
                <!--
                    라벨에는 for를 이용하여 특정 대상을 연결시킬 수 있다
                    for="대상ID"
                    체크박스 등도 선택하게 만들 수 있다(디자인적으로 활용)
                -->
                <label for="id-input"">아이디<span class="important">*</span></label>
                <input type="text" name="memberId" class="form-input w-100" id="id-input" placeholder="영문 소문자, 숫자 8-20 자 이내">
            </div>
            <div class="row left mb-20">
                <label for="pw-input">비밀번호<span class="important">*</span></label>
                <input type="password" name="memberPw" class="form-input w-100" id="pw-input" placeholder="영문 대문자, 숫자, 특수문자 8-16자">
            </div>
            <div class="row left mb-20">
                <label for="nick-input">닉네임<span class="important">*</span></label>
                <input type="text" name="memberNickname" class="form-input w-100" id="nick-input" placeholder="한글, 숫자 2-10자">
            </div>
            <div class="row left mb-20">
                <label for="email-input">이메일</label>
                <input type="email" name="memberEmail" class="form-input w-100" id="email-input" placeholder="testuser1@kh.com">
            </div>
            <div class="row left mb-20">
                <label for="contact-input">연락처</label>
                <input type="tel" name="memberContact" class="form-input w-100" id="contact-input" placeholder="- 제외">
            </div>
            <div class="row left mb-20">
                <label>생년월일</label>
                <input type="date" name="memberBirth" class="form-input w-100">
            </div>
            <div class="row left mb-20">
                <label style="display: block;">주소</label>
                <input type="text" name="memberPost" class="form-input me-20" placeholder="우편번호" style="width: 10em;"">
                <button type="button" class="btn">우편번호 찾기</button>
                <input type="text" name="memberAddr1" class="form-input w-100 mt-10" placeholder="기본주소">
                <input type="text" name="memberAddr2" class="form-input w-100 mt-10" placeholder="상세주소">
            </div>
            <div class="row mb-20">
                <button type="submit" class="btn btn-positive w-100" style="background-color:#f5cd79">회원가입</button>
            </div>
        </div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
