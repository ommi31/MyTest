<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" >

</head>
<body>

<form action="updateBook/{id}">
ID :<input type="text" name="id" id="id" value="${id}" readonly >
NAME :<input type="text" name="name" id="name">
PRICE :<input type="text" name="price" id="price">
<input type="submit" name="btn" value="update book">

</form>

</body>
</html>