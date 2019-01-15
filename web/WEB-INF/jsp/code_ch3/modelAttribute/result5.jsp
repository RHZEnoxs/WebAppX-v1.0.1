<%--
  Created by IntelliJ IDEA.
  User: Enoxs
  Date: 2019/1/12
  Time: 下午 07:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>測試@ModelAttribute註釋一個方法的參數</title>
</head>
<body>
訪問request作用範圍域中的user對象的loginname屬性：${requestScope.user.loginname }<br>
訪問request作用範圍域中的user對象的password屬性：${requestScope.user.password }<br>
訪問request作用範圍域中的user對象的username屬性：${requestScope.user.username }<br>
<br>
</body>
</html>
