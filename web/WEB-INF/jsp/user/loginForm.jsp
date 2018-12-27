<%--
  Created by IntelliJ IDEA.
  User: enoxs
  Date: 2018/12/27
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登入頁面</title>
</head>
<body>
<h3>登入頁面</h3>
<form action="login" method="post">
    <table>
        <tr>
            <td><label>帳號: </label></td>
            <td><input type="text" id="loginname" name="loginname" ></td>
        </tr>
        <tr>
            <td><label>密碼: </label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
