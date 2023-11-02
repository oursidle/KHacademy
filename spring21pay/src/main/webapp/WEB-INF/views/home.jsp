<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/5.3.2/cosmo/bootstrap.min.css" rel="stylesheet">

<div class="container-fluid">
        <div class="row ms-5 mt-5 d-flex justify-content-center">
            <div class="col-md-10 offset-md-1">
				<div class="card border-secondary mb-3" style="max-width: 20rem;">
				  <div class="card-header">결제 학습</div>
				  <div class="card-body">
			  		<c:choose>
					  	<c:when test="${sessionScope.name == null}">
							<form action="login" method="post">
							    <h4 class="card-title">
							    	<input type="text" name="memberId" placeholder="아이디">
							    </h4>
							    <h4 class="card-title">
							    	<input type="password" name="memberPw" placeholder="비밀번호">
							    </h4>
							    <button type="button" class="btn btn-primary">로그인</button>
							</form>
						</c:when>
						<c:otherwise>
							<h4 class="card-title">${sessionScope.name}으로 접속 중...</h4>
							<a href="logout">로그아웃</a>
						</c:otherwise>
					</c:choose>
				  </div>
				</div>
				<div class="row">
					<div class="col-md-10 offset-md-1 content-left">
						<a href="pay/test1"><button type="button" class="btn btn-success">첫 번째 예제</button></a>
						<a href="pay/test2"><button type="button" class="btn btn-success">두 번째 예제</button></a>
						<a href="pay/test3"><button type="button" class="btn btn-success">세 번째 예제</button></a>
					</div>
				</div>
            </div>
        </div>
    </div>
    
    
    
    
    
    
    
<div class="container-fluid">
    <div class="row ms-5 mt-5">
        <div class="col-md-10 offset-md-1">

            <div class="card mb-3">
                <h3 class="card-header">KH shop</h3>
                <div class="card-body">
                    <c:choose>
					  	<c:when test="${sessionScope.name == null}">
							<form action="login" method="post">
							    <h4 class="card-title">
							    	<input type="text" name="memberId" placeholder="아이디">
							    </h4>
							    <h4 class="card-title">
							    	<input type="password" name="memberPw" placeholder="비밀번호">
							    </h4>
							    <button type="button" class="btn btn-primary">로그인</button>
							</form>
						</c:when>
						<c:otherwise>
							<h4 class="card-title">${sessionScope.name}으로 접속 중...</h4>
							<a href="logout">로그아웃</a>
						</c:otherwise>
					</c:choose>
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">
                    	<a href="pay/test1"><button type="button" class="btn btn-success">첫 번째 예제</button></a>
                    	<a href="pay/test2"><button type="button" class="btn btn-success">두 번째 예제</button></a>
                    	<a href="pay/test3"><button type="button" class="btn btn-success">세 번째 예제</button></a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>