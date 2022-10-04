<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${ empty truyen }">
	<P >Khong co du lieu</P>
</c:if>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Desc</th>
			<th>Delete</th>
			<th>Created User</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Last Modified User</th>
			<th>Last Modified Date</th>
			<th>Category</th>
			<th>Number Of Page</th>
		</tr>
	
			<c:forEach items="${ ds }" var="tr">
				<tr>
				<td> ${tr.id } </td>
				<td>${tr.name } </td>
				<td> ${tr.description }</td>
				
			<td> 
				
				<c:if test="${tr.isDeleted eq false }">C xóa</c:if>
				<c:if test="${tr.isDeleted == true }">Đ xóa</c:if>
			</td>
				<td> ${tr.createdUser }</td>
				<td> ${tr.price }</td>
				<td> ${tr.quantity }</td>
				<td> ${tr.lastModifiedUser }</td>
				<td> ${tr.lastModifiedDate }</td>
				<td> ${tr.category }</td>
				<td> ${tr.numberOfPage }</td>
				<td>
						<a class="btn btn-primary"
href="/Ph18216_L3/edit?id=${ tt.id }"
							href="">Cập nhập</a>
					</td>
					<td>
						<a class="btn btn-danger"
href="/Ph18216_L3/delete?id=${ tt.id }"
					href=""	>Xóa</a>
					</td>
				</tr>
			</c:forEach>
		
	</table>




</body>
</html>