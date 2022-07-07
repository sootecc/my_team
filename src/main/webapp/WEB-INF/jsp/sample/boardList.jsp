<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>first</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

</head>
<body>

	<h2>�Խ��� ���</h2>
	<table style="border:1px solid #ccc">
		<colgroup>
			<col width="10%"/>
			<col width="*%"/>
			<col width="15%"/>
			<col width="20%"/>
		</colgroup>
		
		<thead>
			<tr>
				<th scope="col">�۹�ȣ</th>
				<th scope="col">����</th>
				<th scope="col">��ȸ��</th>
				<th scope="col">�ۼ���</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${fn:length(list)>0}">
					<c:forEach items="${list }" var="row">
						<tr>
							<td>${row.IDX }</td>
							<td>${row.TITLE }</td>
							<td>${row.HIT_CNT }</td>
							<td>${row.CREA_DTM }</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="4">��ȸ�� ����� �����ϴ�.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
</body>
</html>