<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>測試errors標籤</title>
</head>
<body>
<h3>註冊頁面</h3>
<form:form modelAttribute="user" method="post" action="register" >
    <table>

        <tr>
            <td>姓名:</td>
            <td><form:input path="username"/></td>
            <td><font color="red"><form:errors path="username"/></font></td>
        </tr>
        <tr>
            <td>性別:</td>
            <td><form:input path="sex"/></td>
            <td><font color="red"><form:errors path="sex"/></font></td>
        </tr>
        <tr>
            <td>年齡:</td>
            <td><form:input path="age"/></td>
            <td><font color="red"><form:errors path="age"/></font></td>
        </tr>
        <tr>
            <td><input type="submit" value="註冊"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>