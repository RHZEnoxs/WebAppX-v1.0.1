<%--
  Created by IntelliJ IDEA.
  User: enoxs
  Date: 2019/2/6
  Time: 6:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>測試select標籤</title>
</head>
<body>
<h3>form:select標籤直接添加form:option</h3>
<form:form modelAttribute="user" method="post" action="selectForm" >
    <table>
        <tr>
            <td>部門:</td>
            <td>
                <form:select path="deptId">
                    <form:option value="1">財務部</form:option>
                    <form:option value="2">開發部</form:option>
                    <form:option value="3">銷售部</form:option>
                </form:select>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
