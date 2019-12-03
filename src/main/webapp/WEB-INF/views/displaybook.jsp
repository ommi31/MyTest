<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOOK</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" >
<!--   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script> -->
</head>
<body align="center">
<div class="container-fluid">

<form action="addbook">

<table class="table table-hover table-dark">
 <thead>
    <tr>
      <th scope="col">Book Id</th>
      <th scope="col">Book Name</th>
      <th scope="col">Book Price</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
<c:forEach var="p" items="${blist}" >
<tr>
<td>${p.id}</td>
<td>${p.name}</td>
<td>${p.price}</td>

<td><a href="delete/${p.id}">delete</a>/
    <a href="edit/${p.id}">edit</a>
</td>
</tr>
</c:forEach>
</table>
<button type="submit" class="btn btn-info" >Add Book</button>
</form>
</div>
</body>
</html>