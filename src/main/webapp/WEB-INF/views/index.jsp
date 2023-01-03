<%--
  Created by IntelliJ IDEA.
  User: subeen
  Date: 2023-01-03
  Time: 오후 8:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/kafka" method="post">
    메시지 입력 : <input type="text" name="message"/>
    <input type="submit" value="전송"/>
</form>
</body>
</html>
