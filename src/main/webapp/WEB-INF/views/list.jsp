<%@ page import="java.util.List" %>
<%@ page import="com.example.kafka01.domain.Order" %><%--
  Created by IntelliJ IDEA.
  User: KyungSubin
  Date: 2023-01-03
  Time: 오후 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Order> orders = (List<Order>) request.getAttribute("orders");
%>
<h1>구매 목록</h1>
<table>
    <tr>
        <td>번호</td>
        <td>이름</td>
        <td>매장 이름</td>
    </tr>
    <%
        for(int i = 0; i < orders.size(); i++) {
    %>
    <tr>
        <td><%= orders.get(i).getOrderNum()%></td>
        <td><%= orders.get(i).getName()%></td>
        <td><%= orders.get(i).getStoreName()%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
