<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<table class="table table-boardered">
	<tr class="danger">
	<td colspan="6"><center>Wishlist</center></td>
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
	<form action="<c:url value="/CaseStudyMVC/spring/updateCart/${cart.cartId}"/>"method="get">
	 	<tr class="info">
	 	
	 	
	 	<td>${cart.productid}</td>
	     <td>${cart.productName}</td>
	     <td><input type="type="text"value="${cart.quantity}" name="quantity"></td>
	     <td>${cart.price}</td>
	     <td>${cart.price * cart.quantity}</td>
	     <td>
	     	
	     	<input type ="submit" value="update" btn="btn-success"/>
	     	<a href="<c:url value="/delCart/${Cart.cartId}"/>"class="btn btn-danger">Delete</a>" 
	     	</td>
	     	</tr>
	     	</form>
	     </c:forEach>
	     
	     <tr class="warning">
	     <td colspan="4"> Total Purchase Amount</td>
	     <td colspan="2">${grandTotal}</td>
	     </tr>
	     
	     <tr class="info">
	     <td colspan="3">
	     
	     <center><a href="<c:url value="/listProduct"/>"class=" btn btn-success"> Continue Your Shopping</a></center>
	     </td>
	     
	     <td colspan="3">
	     	<center><a href="<c:url value="/checkout"/>"class="btn btn-sucess"> Check Out</a></center>
	    </td>
	    </tr>
	    
</table>
</div>
</body>
</html>