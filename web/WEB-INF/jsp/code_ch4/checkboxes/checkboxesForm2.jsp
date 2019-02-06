<%--
  Created by IntelliJ IDEA.
  User: enoxs
  Date: 2019/2/6
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>測試checkboxes標籤</title>
</head>
<body>
<h3>form:checkboxes測試</h3>
<form:form modelAttribute="user" method="post" action="checkboxesForm2">
    <table>
        <tr>
            <td>選擇課程:</td>
            <td>
                <form:checkboxes items="${courseMap}" path="courses"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
