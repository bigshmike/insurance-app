<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<div class="container">
		<div class="container-fluid">
			<!-- If Subscribers query yiels no results, display an error message and a link to do a new search from the home page. -->
			<c:if test="${empty subscribers}">
				<div class="d-flex align-items-center justify-content-center"
					style="min-height: 100vh;">

					<p class="text-center">
						No results found. Please verify the correct SSN or ID Number was
						entered, as well as ensuring it was the primary plan holder's SSN
						or ID Number. <br> <a
							class="link-info link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover"
							href="${pageContext.request.contextPath}/">New Search</a>
					</p>
				</div>
			</c:if>

			<c:forEach items="${subscribers}" var="subscriber">
				<!-- Left-most card: Primary Subscriber Info -->
				<div class="row">
					<div class="col-md-10 d-flex align-items-center">
						<h1>Benefits Summary for ${subscriber.person.firstName }
							${subscriber.person.lastName }</h1>
					</div>
					<div class="col-md-2 d-flex align-items-center">
						<p class="text-right">
							<a
								class="link-info link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover"
								href="${pageContext.request.contextPath}/">New Search</a>
						</p>
					</div>
				</div>

				<div class="row">
					<div class="col-md-4">
						<div class="card bg-default h-100">
							<h5 class="card-header">Primary Subscriber</h5>
							<div class="card-body">
								<p class="card-text">
									Name: ${subscriber.person.firstName }
									${subscriber.person.lastName } <br>DOB:
									${subscriber.person.dob } <br>Subscriber ID:
									${subscriber.subscriberId } <br>
									<c:if
											test="${not empty subscriber.terminatedDate }">
											<span class="badge text-bg-danger">INACTIVE: ${subscriber.terminatedDate }</span>
										</c:if> 
										<c:if
											test="${empty subscriber.terminatedDate }">
											<span class="badge text-bg-success">ACTIVE: ${subscriber.effectiveDate }</span>
										</c:if> 
								</p>
							</div>
						</div>
					</div>
					<!-- Middle card: Plan Details with link to view detailed Plan Info -->
					<div class="col-md-4">
						<div class="card bg-default h-100">
							<h5 class="card-header">Plan</h5>
							<div class="card-body">
								<p class="card-text">
									Group Number: ${subscriber.plan.groupNumber } <br>Group
									Name: ${subscriber.plan.groupName } <br>Insurance Company:
									${subscriber.plan.insuranceCompany.name } <br> <a
										class="link-info link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover"
										href="${pageContext.request.contextPath}/plan/${subscriber.plan.id}"
										target="_blank">Plan Info</a>
								</p>
							</div>
						</div>
					</div>
					<!-- Right-most card: Primary Subscriber's Benefits -->
					<div class="col-md-4">
						<div class="card bg-default h-100">
							<h5 class="card-header">Benefits</h5>
							<div class="card-body">
								<p class="card-text">

									Maximum Benefits: $<fmt:formatNumber type="number" maxFractionDigits="2"
										minFractionDigits="2"
										value="${subscriber.plan.annualMaximum }" />
									<br>Benefits Remaining: $<c:if test="${empty subscriber.benefitsUsed }">0.00</c:if>
									<fmt:formatNumber type="number" maxFractionDigits="2"
										minFractionDigits="2" value="${subscriber.benefitsUsed }" />
								</p>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<!-- Begin Table Layout -->
						<!-- Displays Primary Subscriber's most-frequently-needed last dates of services -->
						<!-- If no history, a badge displays NO HISTORY, otherwise, the date of the specified procedure is shown in a blue badge -->
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
									<td></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<!-- end table layout for  Primary Subscriber -->
				<!-- Dependents Card -->
				<div class="row">
					<div class="col-md-12">
						<div class="card bg-default">
							<h5 class="card-header">Dependents</h5>
							<div class="card-body">
								<!-- If no dependents, a simple message to reflect is displayed. -->
								<c:if test="${empty dependents }">
									<center>There are no dependents attached to this plan.</center>
								</c:if>
								<!-- Begin Dependent -->
								<!-- Name and Benefits Used are displayed in one row; with this layout, more variables *could* be displayed, but may look cluttered -->
								<c:forEach var="dependent" items="${dependents }">

									<div class="row">
										<!-- Light background to help segment -->
										<div class="col-md-9 bg-light d-flex align-items-center">
											<i>${dependent.person.firstName }
												${dependent.person.lastName }</i>
										</div>
										<div class="col-md-3 bg-light d-flex align-items-center">
											<c:if test="${empty dependent.benefitsUsed }">
											Benefits Used: $0
										</c:if>
											<c:if test="${not empty dependent.benefitsUsed }">
											${dependent.benefitsUsed }
										</c:if>
										</div>
										<!-- Div layouts to display exams, X-rays, etc.  -->
										<!-- Just a more concise version of the Subscriber's history -->
										<div class="col-md-3">
											<p class="card-text">
												<b>Exams</b> <br>D0120:
												<c:if test="${empty dependent.dateOfLastD0120}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD0120 }</span>
												<br>D0140:
												<c:if test="${empty dependent.dateOfLastD0140}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD0140 }</span>
												<br>D0150:
												<c:if test="${empty dependent.dateOfLastD0150}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD0150 }</span>
												<br>D0180:
												<c:if test="${empty dependent.dateOfLastD0180}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD0180 }</span>
											</p>
										</div>
										<div class="col-md-3">
											<p class="card-text">
												<b>X-rays</b> <br>D0210:
												<c:if test="${empty dependent.dateOfLastD0210}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD0210 }</span>
												<br>D0272:
												<c:if test="${empty dependent.dateOfLastD0272}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD0272 }</span>
												<br>D0274:
												<c:if test="${empty dependent.dateOfLastD0274}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD0274 }</span>
												<br>D0330:
												<c:if test="${empty dependent.dateOfLastD0330}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD0330 }</span>
											</p>
										</div>
										<div class="col-md-3">
											<p class="card-text">
												<b>Preventive</b> <br>D1110:
												<c:if test="${empty dependent.dateOfLastD1110}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD1110 }</span>
												<br>D1120:
												<c:if test="${empty dependent.dateOfLastD1120}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD1120 }</span>
											</p>
										</div>
										<div class="col-md-3">
											<p class="card-text">
												<b>Periodontal</b> <br>D4341:
												<c:if test="${empty dependent.dateOfLastD4341}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD4341 }</span>
												<br>D4342:
												<c:if test="${empty dependent.dateOfLastD4342}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD4342 }</span>
												<br>D4910:
												<c:if test="${empty dependent.dateOfLastD4910}">
													<span class="badge text-bg-secondary">NO HISTORY</span>
												</c:if>
												<span class="badge text-bg-info">${dependent.dateOfLastD4910 }</span>
											</p>
										</div>

									</div>
									<hr />
								</c:forEach>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>
