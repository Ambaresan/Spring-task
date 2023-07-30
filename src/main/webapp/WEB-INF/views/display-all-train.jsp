<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dsiplay all here</title>
</head>
<body>


<jsp:include page="index.jsp"></jsp:include>
<h1 align="center">ALL TRAIN DETAILS</h1>

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
<c:forEach var="train" items="${allTrain }">

<tr>
<td> ${train.trainNumber }</td>
<td> ${train.trainName }</td>
<td> ${train.type }</td>
<td> ${train.sourceStation }</td>
<td> ${train.depatureTime }</td>
<td> ${train.destinationstation }</td>
<td> ${train.arrivedTime }</td>


</tr>
</c:forEach>

</table>

<div class="pagination">
    <c:if test="${page > 1}">
        <a href="<c:url value='/display-all-train'/>?page=${page - 1}">Previous</a>
    </c:if>
    <h2>Displaying Trains - Page ${page}</h2>
    <c:if test="${not empty allTrain and allTrain.size() == 10}">
        <button onclick="incrementPage()">Next</button>
    </c:if>
</div>


<script>
    function incrementPage() {
        var currentPage = ${page}; 
        var nextPage = currentPage + 1; 
        window.location.href = '<c:url value="/display-all-train"/>?page=' + nextPage; 
        }
</script>

</body>
</html>