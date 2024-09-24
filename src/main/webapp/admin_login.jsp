<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login Here</title>
<%@include file="component/allcss.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.3);
}

.Img {
	background-image: linear-gradient(rgba(0, 0, 0, .4), rgba(0, 0, 0, .4)),
		url("img/hos5.jpg");
	height: 60vh;
	width: 100%;
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
</head>
<body>
	<%@ include file="component/navbar.jsp"%>
	<div class="container-fluid Img p-5">
		<p class="text-center fs-2 text-white"></p>
	</div>
	<div class="container p-5 ">

		<div class="row">

			<div class="col-md-4 offset-md-4 ">
				<div class="card paint-card ">
					<div class="card-body">
						<p class="fs-4 text-center">Admin Login</p>

						<c:if test="${not empty succMsg}">
							<p class="text-center text-primary fs-3">${succMsg}</p>
							<c:remove var="succMsg" scope="session" />
						</c:if>

						<c:if test="${not empty errorMsg}">
							<p class="text-center text-danger fs-5">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>

						<form action="adminLogin" method="post">
							<div class="mb-3">
								<label class="form-label">Email address</label> <input required
									name="email" type="email" class="form-control">
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label> <input required
									name="password" type="password" class="form-control">
							</div>

							<button type="submit"
								class="btn bg-secondary text-white col-md-12">Login</button>
						</form>
					</div>
				</div>
			</div>

		</div>

	</div>

	<div>
		<%@ include file="component/footer.jsp"%>
	</div>
</body>
</html>