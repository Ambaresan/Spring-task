<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>display  here</title>
</head>
<body>
<h1 align="center">Train Details</h1>

<table border="1" align="center">

<tr>

<th> Train Number</th>
<th>Train Name</th>
<th> Train Type</th>
<th>Source station</th>
<th>depature time</th>
<th>desitnation station</th>
<th> arrived time</th>
</tr>

<tr>
<td> ${train.trainNumber }</td>
<td> ${train.trainName }</td>
<td> ${train.type }</td>
<td> ${train.sourceStation }</td>
<td> ${train.depatureTime }</td>
<td> ${train.destinationstation }</td>
<td> ${train.arrivedTime }</td>



</tr>

</table>

</body>
</html>