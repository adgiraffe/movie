<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="mSearch">
	<table>
		<tr>
			<td>영화제목검색</td>
			<td><input type="text" name="searchKey"></td>
			<td><input type="submit" value="검색"></td>
		</tr>
	</table>
</form>
<form action="" method="post">
	<table>
			<tr>
				<td>영화등록</td>				
			</tr>

			<tr>
				<td>영화제목</td>
				<td><input type="text" name="mTitle" value="${result.title}"></td>
			</tr>
			<tr>
				<td>이미지</td>
				<td><img alt="" src="${result.img}" name="mImg"></td>
			</tr>
			<tr>
				<td>감독</td>
				<td><input type="text" name="mDirecotr" value="${result.director}"></td>
			</tr>
			<tr>
				<td>배우</td>
				<td><input type="text" name="mActor" value="${result.actor}"></td>
			</tr>
			
			<tr>
				<td>스토리</td>
				<td><input type="text" name="mStory" value="${result.content}"></td>
			</tr>
			<tr>
				<td>영화가격</td>
				<td><input type="text" name="moviePrice"></td>

			</tr>
			<tr>
				<td>영화개봉일</td>
				<td><input type="date" name="openDate"></td>
			</tr>
			<tr>
				<td>개봉종료일</td>
				<td><input type="date" name="endDate"></td>
			</tr>
			<tr>
				<td>
				<input type="button" value="등록">
				</td>
			</tr>
	</table>
</form>	
</body>
</html>