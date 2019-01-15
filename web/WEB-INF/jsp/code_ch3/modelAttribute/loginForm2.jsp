<%--
  Created by IntelliJ IDEA.
  User: Enoxs
  Date: 2019/1/12
  Time: 下午 07:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>測試@ModelAttribute</title>
</head>
<body>
<h3>測試@ModelAttribute註釋void返回值的方法</h3>
<form action="login2" method="post">
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
            <td><input id="submit" type="submit" value="登入"></td>
        </tr>
    </table>
</form>

</body>
</html>
