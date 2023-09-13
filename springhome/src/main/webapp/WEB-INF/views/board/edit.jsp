<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<script>
        $(function () {
            $('[name=boardContent]').summernote({
                placeholder: '내용을 작성하세요',
                tabsize: 2,//탭 이동 간격
                height: 300,//에디터 높이
                minHeight: 300,//에이터 최소 높이
                lineHeight: 20,//기본 줄 간격
                toolbar: [
                    ['style', ['style']],
                    ['font', ['bold', 'italic', 'underline']],
                    ['color', ['color']],
                    ['para', ['paragraph']],
                    ['table', ['table']],
                    ['insert', ['link']],
                ]
            });
        });
</script>

<div class="container w-600">
	<div class="row">
		<h2 style="color:#F7819F">게시글 수정</h2>
	</div>
	
	<form action="edit" method="post" autocomplete="off">
		<input class="form-input w-100" type="hidden" name="boardNo" value="${boardDto.boardNo}">
		<div class="row left" style="font-size:20px">
			<span style="color:#574b90">제목</span>
		</div>
		<div class="row">
			<input class="form-input w-100" type="text" name="boardTitle" value="${boardDto.boardTitle}" required>
		</div>
		<div class="row left" style="font-size:20px">
			<span style="color:#574b90">내용</span>
			<textarea name="boardContent">${boardDto.boardContent}</textarea>
		</div>
		<div class="row right">
            <span class="len red">0</span> / 1000
        </div>
		<div class="row right">
			<button class="btn btn-positive" style="background-color:#ffb6c1; border-color:#ffb6c1">수정</button>
		</div>
		<div class="row right">
			<h4 style="color:#F7819F"><a href="detail?boardNo=${boardDto.boardNo}">취소</a></h4>
		</div>
	</form>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>