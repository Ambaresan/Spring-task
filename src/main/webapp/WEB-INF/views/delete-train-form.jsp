<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete here</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
<form action="deletetrain"> 
<label>Train Number</label>
<input type="text" name="TrainNumber">
<br><br>

<input type="submit" value="Delete train">
</form>

</body>
</html>