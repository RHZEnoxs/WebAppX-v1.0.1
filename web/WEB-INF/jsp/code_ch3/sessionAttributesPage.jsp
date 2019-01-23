<%--
  Created by IntelliJ IDEA.
  User: Enoxs
  Date: 2019/1/12
  Time: 下午 06:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>測試 @SessionAttributes 註解</title>
</head>
<body>
訪問 request 作用範圍域中的user對象：${requestScope.user.username }<br>
訪問 session 作用範圍域中的user對象：${sessionScope.user.username }<br>

<p>requestScope:</p>
Account： ${requestScope.user.loginname }<br>
Password： ${requestScope.user.password }<br>

<p>sessionScope:</p>
Account： ${sessionScope.user.loginname }<br>
Password： ${sessionScope.user.password }<br>
</body>
</html>
