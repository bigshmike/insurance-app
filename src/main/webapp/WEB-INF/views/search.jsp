<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home - Search</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
	<div class="container">

		<h1 class="mt-4">Search Page</h1>

		<form action="/processSearch" method="post">
			<div class="form-group">
				<label>Search By:</label><br>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="searchType"
						id="searchById" value="id" checked> <label
						class="form-check-label" for="searchById">ID</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="searchType"
						id="searchBySSN" value="ssn"> <label
						class="form-check-label" for="searchBySSN">SSN</label>
				</div>
			</div>

			<div class="form-group">
				<label for="inputText">Search Value:</label> <input type="text"
					class="form-control" id="inputText" name="inputText" placeholder="Enter a Primary Subscriber SSN or Subscriber ID"/>
			</div>

			<div class="form-group">
				<button type="submit" class="btn btn-primary">Search</button>
			</div>
		</form>
		<hr/>
		<h5>Upload Database Records</h5>
		<p>.json files only</p>
		<div class="custom-file">
			<form action="/upload" method="post" enctype="multipart/form-data">
				<div class="input-group mb-3">
					<div class="custom-file">
						<input type="file" class="custom-file-input" id="inputGroupFile02"
							name="file" onchange="updateFileName()"> <label
							class="custom-file-label" for="inputGroupFile02"
							id="fileNameLabel">Upload Plan, Person, Subscriber, or Dependent records</label>
					</div>
					<div class="input-group-append">
						<button type="submit" class="input-group-text">Upload</button>
					</div>
				</div>
			</form>
		</div>

		<script>
			function updateFileName() {
				var input = document.getElementById('inputGroupFile02');
				var label = document.getElementById('fileNameLabel');
				if (input.files && input.files.length > 0) {
					label.innerHTML = input.files[0].name;
				} 
				else {
					label.innerHTML = 'Upload Plan, Person, Subscriber, or Dependent records';
				}
			}
		</script>
	</div>
</body>


</html>