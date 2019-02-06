<%--
  Created by IntelliJ IDEA.
  User: enoxs
  Date: 2019/2/5
  Time: 10:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第四章 Spring MVC 的標籤庫</title>
    <script src="../../static/jquery/jquery.js"></script>
    <script src="../../static/bootstrap/js/bootstrap.js"></script>
    <link href="../../static/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="../../static/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
    <script src="../../static/plugin/moment.min.js"></script>
    <script src="../../static/plugin/json2.js"></script>
</head>
<body>
<div id="content" style="margin:5px 10px 15px 20px">
    <h2>第四章 Spring MVC 的標籤庫</h2>
    <h3>1. form 和 input 標籤的使用</h3>
    <a href="jspTag/registerForm">測試 form 標籤 (method="post) </a>(UserController)
    <br>
    <a href="jspTag/registerForm2">測試 form 標籤 (modelAttribute="userInfo")</a>(UserController)
    <h3>2. checkbox 標籤的使用</h3>
    <a href="jspTag/checkboxForm">測試 checkbox form 標籤</a>(UserController)
    <h3>3. checkboxes 標籤的使用</h3>
    <a href="jspTag/checkboxesForm">測試 checkbox form 標籤 #1</a>(UserController)
    <br>
    <a href="jspTag/checkboxesForm2">測試 checkbox form 標籤 #2</a>(UserController)
    <br>
    <a href="jspTag/checkboxesForm3">測試 checkbox form 標籤 #3</a>(UserController)
    <h3>4. RadioButton 標籤的使用</h3>
    <a href="jspTag/radiobuttonForm">測試 radiobuttion 標籤的使用</a>(UserController)
    <br>
    <a href="jspTag/radiobuttonsForm">測試 radiobuttons 標籤的使用 #1</a>(UserController)
    <br>
    <a href="jspTag/radiobuttonsForm2">測試 radiobuttons 標籤的使用 #2</a>(UserController)
    <h3>5. select 標籤、option 標籤、options 標籤</h3>
    <a href="jspTag/selectForm">測試 form:select標籤直接添加form:option </a>(UserController)
    <br>
    <a href="jspTag/selectForm2">測試 form:select標籤items屬性綁定Map</a>(UserController)
    <br>
    <a href="jspTag/selectForm3">測試 使用form:options標籤items屬性綁定Map</a>(UserController)
    <br>
    <a href="jspTag/selectForm4">測試 使用form:options標籤綁定Object</a>(UserController)
    <h3>6. errors 標籤的使用</h3>
    <a href="jspTag/registerFormCheck">測試 errors 標籤的使用</a>(UserController)
    <br>
</div>

</body>
</html>
