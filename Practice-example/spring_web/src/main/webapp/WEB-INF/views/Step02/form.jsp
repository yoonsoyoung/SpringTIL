<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Step02 | Form</title>
</head>
<body>
	<div class="container">
		<div class="col-lg-6">
			<h5 class="text-center title">Spring을 이용한 파라미터 전달(Single)</h5>
			<form name="paramform" method="get" action="${root }/sendparam">
				<div class="form-group">
					<label for="userid">아이디:</label> <input type="text"
						class="form-control" name="userid" placeholder="아이디 입력">
				</div>
				<div class="form-group">
					<label for="username">이름:</label> <input type="text"
						class="form-control" name="username" placeholder="이름 입력">
				</div>
				<div class="form-group">
					<label for="area">지역:</label> <select name="area"
						class="custom-select">
						<option value="0" selected>대전</option>
						<option value="1">서울</option>
						<option value="2">광주</option>
						<option value="3">구미</option>
					</select>
				</div>
				<button type="submit" class="btn btn-primary">전송</button>
			</form>
		</div>
		<div class="col-lg-6 mt-4">
			<h5 class="text-center title">Spring을 이용한 파라미터 전달(multi)</h5>
			<form name="paramform" method="post" action="${root }/sendparam">
				<div class="form-group">
					<label for="userid">아이디:</label> <input type="text"
						class="form-control" name="userid" placeholder="아이디 입력">
				</div>
				<div class="form-group">
					<label for="username">이름:</label> <input type="text"
						class="form-control" name="username" placeholder="이름 입력">
				</div>
				<div class="form-group">
					<label for="">좋아하는 과일:</label>
					<div>
						<div class="form-check-inline">
							<label class="form-check-label"> <input type="checkbox"
								class="form-check-input" value="딸기" name="fruit">딸기
							</label>
						</div>
						<div class="form-check-inline">
							<label class="form-check-label"> <input type="checkbox"
								class="form-check-input" value="수박" name="fruit">수박
							</label>
						</div>
						<div class="form-check-inline">
							<label class="form-check-label"> <input type="checkbox"
								class="form-check-input" value="포도" name="fruit">포도
							</label>
						</div>
						<div class="form-check-inline">
							<label class="form-check-label"> <input type="checkbox"
								class="form-check-input" value="사과" name="fruit">사과
							</label>
						</div>
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>

<style type="text/css">
.container>div {
	margin: 0 auto;
	margin-top: 50px;
}

.title {
	padding: 10px;
}
</style>