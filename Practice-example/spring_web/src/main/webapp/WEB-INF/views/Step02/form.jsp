<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
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
			<h5 class="text-center title">Spring�� �̿��� �Ķ���� ����(Single)</h5>
			<form name="paramform" method="get" action="${root }/sendparam">
				<div class="form-group">
					<label for="userid">���̵�:</label> 
					<input type="text" class="form-control" name="userid"
						placeholder="���̵� �Է�">
				</div>
				<div class="form-group">
					<label for="username">�̸�:</label> 
					<input type="text" class="form-control" name="username"
						placeholder="�̸� �Է�">
				</div>
				<div class="form-group">
					<label for="area">����:</label> 
					<select name="area" class="custom-select">
						<option value="0" selected>����</option>
						<option value="1">����</option>
						<option value="2">����</option>
						<option value="3">����</option>
					</select>
				</div>
				<button type="submit" class="btn btn-primary">����</button>
			</form>
		</div>
		<div class="col-lg-6 mt-4">
			<h5 class="text-center title">Spring�� �̿��� �Ķ���� ����(multi)</h5>
			<form name="paramform" method="get" action="${root }/sendparam">
				<div class="form-group">
					<label for="userid">���̵�:</label> 
					<input type="text" class="form-control" name="userid"
						placeholder="���̵� �Է�">
				</div>
				<div class="form-group">
					<label for="username">�̸�:</label> 
					<input type="text" class="form-control" name="username"
						placeholder="�̸� �Է�">
				</div>
				<div class="form-group">
					<label for="area">�����ϴ� ����:</label> 
					<div>
						<div class="form-check-inline">
						  <label class="form-check-label">
						    <input type="checkbox" class="form-check-input" value="strawberry">����
						  </label>
						</div>
						<div class="form-check-inline">
						  <label class="form-check-label">
						    <input type="checkbox" class="form-check-input" value="watermelon">����
						  </label>
						</div>
						<div class="form-check-inline">
						  <label class="form-check-label">
						    <input type="checkbox" class="form-check-input" value="grape">����
						  </label>
						</div>
						<div class="form-check-inline">
						  <label class="form-check-label">
						    <input type="checkbox" class="form-check-input" value="apple">���
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
.container > div {
	margin: 0 auto;
	margin-top: 50px;
}
.title {
	padding: 10px;
}
</style>