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
<form method="POST" action="/ph18216_L3/truyen-Tranh1">
		<div>
			<label>Tên: </label> <input type="text"  name="name">
		</div>
		<br>
		<div>
			<label>Mô tả: </label> <input type="text"  name="description">
		</div>
		<br>
		<div>
			<label>Giá: </label> <input type="text"  name="price">
		</div>

		<br>
		<div>
			<label>Quantity: </label> <input type="number"  name="quantity" >
		</div>
		<br>
		<div>
			<label>Created User: </label> <input type="text"  name="createdUser" >
		</div>
		<br>
		<div>
			<label>Last User: </label> <input type="text"  name="lastModifiedUser" >
		</div>
		<br>
		<div>
			<label>Last Date: </label> <input type="date"  name="lastModifiedDate" >
		</div>
		<br>
		<div>
			<label>Category: </label> <input type="text"  name="category" >
		</div>
		<br>
		<div>
			<label>Number Of Page: </label> <input type="number"  name="numberOfPage" >
		</div>
		
		<br>
		<div>
			<label>Đã xóa: </label> <input type="radio" name="isDeleted"
				value="false" checked="checked"> <label>Chưa xóa</label> <input
				type="radio" name="isDeleted" value="true"> <label>Đã xóa</label>
		</div>
		<br>

		<button  >Xong</button>
		<button type="reset">Xóa form</button>
	</form>


</body>
</html>