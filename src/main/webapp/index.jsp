<%@page import="com.db.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E-HealthCareManagement</title>
<%@include file="component/allcss.jsp"%>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<%@ include file="component/navbar.jsp"%>
	

	<div id="carouselExampleFade" class="carousel slide carousel-fade"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/hos1.png" class="d-block w-100" alt="..."
					height="500px">
			</div>
			<div class="carousel-item">
				<img src="img/hos2.jpg" class="d-block w-100" alt="..."
					height="500px">
			</div>
			<div class="carousel-item">
				<img src="img/hos3.jpg" class="d-block w-100" alt="..."
					height="500px">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>

	<div class="container p-3">
		<p class="text-center fs-2 ">Key Features of our Hospital</p>

		<div class="row">
			<div class="col-md-8 p-5">
				<div class="row">
					<div class="col-md-6">
						<div class="cord paint-card">
							<div class="card-body">
								<p class="fs-5">100% Safety</p>
								<p>To keep staff, patients and visitors safe, hospitals use
									a range of security measures, including the use of CCTV
									cameras, duress alarms for staff members and electronic access
									control systems for doorways.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2" >
						<div class="cord paint-card">
							<div class="card-body">
								<p class="fs-5">Friendly Doctors</p>
								<p>Specific tasks depend on your specialty - for instance,
									the work surgeons carry out on a daily basis is completely
									different from the workload of an accident and emergency doctor</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-4">
				<img alt="" src="img/doc2.jpg" height="280px">
			</div>
		</div>
	</div>

<%@ include file="component/footer.jsp" %>

</body>
</html>