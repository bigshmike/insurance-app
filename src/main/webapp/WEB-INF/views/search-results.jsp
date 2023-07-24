<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Search Results</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body>
	<c:forEach items="${subscribers}" var="subscriber">
		<div class="container">
			<div class="container-fluid">
				<h1>Benefits Summary for ${subscriber.person.firstName }
					${subscriber.person.lastName }</h1>
				<div class="row">
					<div class="col-md-4">
						<div class="card bg-default h-100">
							<h5 class="card-header">Primary Subscriber</h5>
							<div class="card-body">
								<p class="card-text">
									Name: ${subscriber.person.firstName }
									${subscriber.person.lastName } <br>DOB:
									${subscriber.person.dob } <br>Subscriber ID:
									${subscriber.subscriberId }
								</p>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="card bg-default h-100">
							<h5 class="card-header">Plan</h5>
							<div class="card-body">
								<p class="card-text">
									Group Number: ${subscriber.plan.groupNumber } <br>Group
									Name: ${subscriber.plan.groupName }
									<br><a class="link-info link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover" href="${pageContext.request.contextPath}/plan/${subscriber.plan.id}" target="_blank">Plan Info</a> 
								</p>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="card bg-default h-100">
							<h5 class="card-header">Benefits</h5>
							<div class="card-body">
								<p class="card-text">
									Maximum Benefits: ${subscriber.plan.annualMaximum } <br>Benefits
									Remaining:
								</p>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<h2>Diagnostic</h2>
						<table class="table table-sm">
							<tbody>
								<th scope="row">Exams</th>
								<th></th>
								<tr>
									<td>Periodic Oral Evaluation (D0120): <c:if
											test="${empty subscriber.dateOfLastD0120}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD0120 }</span></td>
									<td>Limited Oral Evaluation (D0140): <c:if
											test="${empty subscriber.dateOfLastD0140}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD0140 }</span></td>
								</tr>
								<tr>
									<td>Comprehensive Oral Evaluation (D0150): <c:if
											test="${empty subscriber.dateOfLastD0150}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD0150 }</span></td>
									<td>Comprehensive Periodontal Evaluation (D0180): <c:if
											test="${empty subscriber.dateOfLastD0180}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD0180 }</span></td>
								</tr>
								<th>X-rays</th>
								<th></th>
								<tr>
									<td>Full Mouth Series with Bitewings (D0210): <c:if
											test="${empty subscriber.dateOfLastD0210}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD0210 }</span></td>
									<td>Panoramic Image (D0330): <c:if
											test="${empty subscriber.dateOfLastD0330}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD0330 }</span></td>
								</tr>
								<tr>
									<td>2 Bitewings (D0272): <c:if
											test="${empty subscriber.dateOfLastD0272}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD0272 }</span></td>
									<td>4 Bitewings (D0274): <c:if
											test="${empty subscriber.dateOfLastD0274}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD0274 }</span></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="col-md-12">
						<h2>Preventive</h2>
						<table class="table table-sm">
							<tbody>
								<th scope="row">Prophylaxis</th>
								<th></th>
								<tr>
									<td>Adult Prophy (D0110): <c:if
											test="${empty subscriber.dateOfLastD1110}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD1110 }</span></td>
									<td>Child Prophy (D0120): <c:if
											test="${empty subscriber.dateOfLastD1120}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD1120 }</span></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="col-md-12">
						<h2>Periodontal</h2>
						<table class="table table-sm">
							<tbody>
								<th scope="row">Scaling & Root Planing</th>
								<th></th>
								<tr>
									<td>Scale and Root Plane, 4+ teeth (D4341): <c:if
											test="${empty subscriber.dateOfLastD4341}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD4341 }</span></td>
									<td>Scale and Root Plane, 1-3 teeth (D4342): <c:if
											test="${empty subscriber.dateOfLastD4342}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD4342 }</span></td>
								</tr>
								<th scope="row">Maintenance</th>
								<th></th>
								<tr>
									<td>Periodontal Maintenance (D4910): <c:if
											test="${empty subscriber.dateOfLastD4910}">
											<span class="badge text-bg-secondary">NO HISTORY</span>
										</c:if> <span class="badge text-bg-info">${subscriber.dateOfLastD4910 }</span></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
</body>
</html>
