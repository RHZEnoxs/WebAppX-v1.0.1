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
<h3>使用form:options標籤綁定Object</h3>
<form:form modelAttribute="user" method="post" action="selectForm" >
    <table>
        <tr>
            <td>學歷:</td>
            <td>
                <form:select path="deptId">
                    <form:options items="${deptList}"
                                  itemLabel="name" itemValue="id"/>
                </form:select>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
