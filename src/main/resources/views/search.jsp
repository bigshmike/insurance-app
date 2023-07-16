<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
    <div class="container">
        <h1 class="mt-4">Search Page</h1>
        
        <form action="/processSearch" method="post">
            <div class="form-group">
                <label for="searchType">Search By:</label>
                <select class="form-control" id="searchType" name="searchType">
                    <option value="ssn">SSN</option>
                    <option value="id">ID</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="inputText">Search Text:</label>
                <input type="text" class="form-control" id="inputText" name="inputText" />
            </div>
            
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Search</button>
            </div>
        </form>
    </div>
</body>
</html>