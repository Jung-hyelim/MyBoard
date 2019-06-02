<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Documents List</title>
</head>
<body>
<div>
	<h1>Documents</h1>
	<table border="1" width="500">
		<thead>
			<tr>
				<th width="50">No.</th>
				<th>제목</th>
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
	<button onclick="window.location.href='/documents/new'">글쓰기</button>
</div>
</body>
</html>