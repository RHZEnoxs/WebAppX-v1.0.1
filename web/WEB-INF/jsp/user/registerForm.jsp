<%--
  Created by IntelliJ IDEA.
  User: enoxs
  Date: 2018/12/27
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>註冊頁面</title>
</head>
<body>
<h3>註冊頁面</h3>
<form action="register" method="post">
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
            <td><label>名稱: </label></td>
            <td><input type="text" id="username" name="username" ></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="註冊"></td>
        </tr>
    </table>
</form>
</body>
</html>
