%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
      
<!DOCTYPE html>    PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>


<div class="container">
<table class="table table-boardered">
	<tr class="danger">
	<td colspan="6"><center>PRODUCT</center></td>
	</tr>
	<tr>
	
	<td>product Id</td>
	<td>Product Name</td>
	<td>Quantity</td>
	<td>Price</td>
	<td>SubTotal</td>
	<td>Operation</td>
	</tr>
	
	
	<c:forEach items="${cartlist}" var="cart">
	<form action="<c:url value="/CaseStudyMVC/spring/addToCart/${product.pid}"/>"method="get">
	 	<tr class="info">
	 	
	 	
	 	<td>${cart.productid}</td>
	     <td>${cart.productName}</td>
	     <td><input type="type="text"value="${cart.quantity}" name="quantity"></td>
	     <td>${cart.price}</td>
	     <td>${cart.price * cart.quantity}</td>
	     <td>
	     	
	     	<input type ="submit" value="BUY" btn="btn-success"/>
	     </tr>
	     	</form>
	     </c:forEach>
	     
</table>
</div>
</body>
</html>