<%--
  Created by IntelliJ IDEA.
  User: enoxs
  Date: 2019/2/6
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>測試radiobuttons標籤</title>
</head>
<body>
<h3>form:radiobuttons測試</h3>
<form:form modelAttribute="user" method="post" action="radiobuttonForm2" >
    <table>
        <tr>
            <td>性別:</td>
            <td>
                <form:radiobuttons path="sex" items="${sexMap }"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
