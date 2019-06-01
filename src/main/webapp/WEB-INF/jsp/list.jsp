<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div>
	<h1>Documents</h1>
	<table border="1">
		<thead>
			<tr>
				<th>No.</th>
				<th>����</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="d" items="${list }">
			<tr>
				<td>${d.id }</td>
				<td><a href="/documents/${d.id }">${d.title }</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>