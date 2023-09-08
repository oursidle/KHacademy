<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<!-- Java Script 작성 공간 -->
	<script>
	    $(function(){
	        //전체 선택과 개별 체크박스에 대한 이벤트 구현
	        $(".delete-btn").hide();
	
	        //전체 선택
	        $(".check-all").change(function(){
	            var checked = $(this).prop("checked");
	            $(".check-all, .check-item").prop("checked", checked);
	            
	            if(checked){
	            	//$(".delete-btn").css("display", "inline-block");
	            	//$(".delete-btn").show();
	            	$(".delete-btn").fadeIn("fast");
	            	//$(".delete-btn").slideDown();
	            }else{
	            	//$(".delete-btn").css("display", "none");
	            	//$(".delete-btn").hide();
	            	$(".delete-btn").fadeOut("fast");
	            	//$(".delete-btn").slideUp();
	            }
	        });
	
	        //개별 체크박스
	        $(".check-item").change(function(){
	            //var allChecked = 개별 체크박스 개수 == 체크된 개별 체크박스 개수;
	            //var allChecked = $(".check-item").length == $(".check-item:checked").length;//CSS 방식
	            var allChecked = $(".check-item").length == $(".check-item").filter(":checked").length;//jQuert 방식
	            $(".check-all").prop("checked", allChecked);
	            
	            if($(".check-item").filter(":checked").length > 0){
	            	$(".delete-btn").fadeIn("fast");
	            }else{
	            	$(".delete-btn").fadeOut("fast");
	            }
	        });
	        
	        $(".delete-form").submit(function(e){
	        	return confirm("정말 삭제하시겠습니까?");
	        });
	    });
	</script>

	<div class="container w-800">
		<div class="row">
			<h1 style="color:#FA5882">자유 게시판</h1>
		</div>

		<!-- 폼 시작 -->
		<form class="delete-form" action="deleteByAdmin" method="post">

		<%-- 
			검색일 경우 검색어를 추가로 출력
			(참고) 논리 반환값을 가지는 getter 메소드는 get이 아니라 is로 시작한다
		 --%>
		<c:if test="${vo.search}">
			<div class="row">
				<h3>&quot;${vo.keyword}&quot;에 대한 검색 결과</h3>
			</div>
		</c:if>


		<%-- 글쓰기는 로그인 상태인 경우에만 출력 --%>
		<c:if test="${sessionScope.name != null}">
			<div class="row right">
				<c:if test="${sessionScope.level == '관리자'}">
					<button type="submit" class="btn btn-negative delete-btn" style="background-color:#ffb6c1; border-color:#ffb6c1;
					 															height: 25px;font-size: 14px; padding-top: 3px; color: black;">
					 	<i class="fa-solid fa-trash"></i>
					 	삭제
					 </button>							
				</c:if>
				<a href="write" class="btn btn-negative" style="background-color:#ffb6c1; border-color:#ffb6c1;
				 															height: 25px;font-size: 14px; padding-top: 3px; color: black;">
				 	<i class="fa-solid fa-pen"></i>
				 	작성
				 </a>
			</div>
		</c:if>

		<div class="row">
			<table class="table table-slit">
				<thead>
					<tr bgcolor="#ffb6c1">
						<c:if test="${sessionScope.level == '관리자'}">
							<th>
								<!-- 전체선택 체크박스 -->
								<input type="checkbox" class="check-all">
							</th>
						</c:if>
						<th width="7%">번호</th>
						<th width="30%">제목</th>
						<th>작성자</th>
						<th>조회수</th>
						<th>좋아요</th>
						<th>작성일</th>		
				</thead>
				<tbody align="center">
					<c:forEach var="boardListDto" items="${list}">
						<tr>
							<c:if test="${sessionScope.level == '관리자'}">
								<td>
									<!-- 개별항목 체크박스 -->
									<input type="checkbox" class="check-item" name="boardNoList" value="${boardListDto.boardNo}">
								</td>
							</c:if>
							<td>${boardListDto.boardNo}</td>
							<td align="left">
						
								<%-- 차수만큼 띄어쓰기 출력 --%>
								<%-- for(int i=1; i <= 차수; i ++ ){ --%>
								<c:forEach var="i" begin="1" end="${boardListDto.boardDepth}" step="1">
									&nbsp;&nbsp;&nbsp;
								</c:forEach>
								
								<%-- 띄어쓰기 뒤에 화살표 표시 --%>
								<c:if test="${boardListDto.boardDepth > 0}">
									<i class="fa-solid fa-arrow-right"></i>
								</c:if>
								
								<!-- 제목을 누르면 상세페이지로 이동 -->
								<a class="link" href="detail?boardNo=${boardListDto.boardNo}">
									${boardListDto.boardTitle}</a>
								
								<!-- 댓글이 있다면 개수를 표시 -->
								<c:if test="${boardListDto.boardReplyCount > 0}">
									[${boardListDto.boardReplyCount}]
								</c:if>
							</td>
							
							<%-- 사용자가 없으면 탈퇴한 사용자로 표시 --%>
			<%-- 				<c:choose> --%>
			<%-- 					<c:when test="${boardListDto.boardWriter != null}"> --%>
			<%-- 						<td>${boardListDto.boardWriter}</td> --%>
			<%-- 					</c:when> --%>
			<%-- 					<c:otherwise> --%>
			<!-- 						<td>(탈퇴한 사용자)</td> -->
			<%-- 					</c:otherwise>	 --%>
			<%-- 				</c:choose> --%>
			
							<td>${boardListDto.boardWriterString}</td>
							<td>${boardListDto.boardReadCount}</td>
							<td>${boardListDto.boardLikeCount}</td>
							<td>${boardListDto.getBoardCTimeString()}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		</form>
		<!-- 폼 종료 -->

		<!--  페이지 네이게이터 출력 -->
		<div class="row page-navigator mv-30">
		
			<!-- 이전 버튼 -->
			<c:if test="${!vo.first}">	
				<a href="list?${vo.prevQueryString}">
					<i class="fa-solid fa-angle-left"></i>
				</a>
			</c:if>
			
			<!-- 숫자 버튼 -->
			<c:forEach var="i" begin="${vo.begin}" end="${vo.end}" step="1">
				<c:choose>
					<c:when test="${vo.page == i}">
						<a class="on">${i}</a>
					</c:when>
					<c:otherwise>
						<a href="list?${vo.getQueryString(i)}">${i}</a>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			
			<!-- 다음 버튼 -->
			<c:if test="${!vo.last}">	
				<a href="list?${vo.nextQueryString}">
					<i class="fa-solid fa-angle-right"></i>
				</a>
			</c:if>
		</div>
	
		<!-- 검색창 -->
		<form action="list" method="get">
			<div class="row">
				<c:choose>
					<c:when test="${param.type == 'board_writer'}">
						<select name="type"  class="form-input" required>
							<option value="board_title">제목</option>
							<option value="board_writer" selected>작성자</option>
						</select>
					</c:when>
					<c:otherwise>
						<select name="type" class="form-input" required>
							<option value="board_title">제목</option>
							<option value="board_writer">작성자</option>
						</select>
					</c:otherwise>
				</c:choose>
				
				<input type="search" name="keyword" class="form-input" placeholder="검색어 입력" value="${param.keyword}" required>
				<button type="submit" class="btn btn-positive" style="background-color:#ffb6c1; border-color:#ffb6c1;">
					<i class="fa-solid fa-magnifying-glass"></i>검색
				</button>	
			</div>
		</form>

	</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>