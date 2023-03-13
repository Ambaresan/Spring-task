<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>save train form here</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>

<h2>Add Train Data</h2>

<form action="save-train" method="post">

<label>Train Name</label>
<input type="text" name="trainName">
<br><br>

<label>Train Type</label>
<input type="radio" name="type" value="Passenger"><label>Passenger</label>
<input type="radio" name="type" value="Express"><label>Express </label>
<input type="radio" name="type" value="Super Fast"><label>Super Fast </label>
<input type="radio" name="type" value="Goods"><label>Goods </label>
<br><br>

<label>Train Source Station</label>
<input type="text" name="sourceStation">
<br><br>

<label>Train Destination Station</label>
<input type="text" name="destinationstation">
<br><br>
<label>Train Departure Time</label>
<input type="time" name="depatureTime">
<br><br>

<label>Train Arrived Time</label>
<input type="time" name="arrivedTime">
<br><br>


<input type="submit" value="Add train">


</form>

</body>
</html>