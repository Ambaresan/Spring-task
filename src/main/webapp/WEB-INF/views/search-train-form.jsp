<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search here</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
<form action="search-train"> 
<label>Train Number</label>
<input type="text" name="TrainNumber">
<br><br>

<input type="submit" value="Search train">
</form>

</body>
</html>