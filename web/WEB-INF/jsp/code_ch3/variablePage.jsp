<%--
  Created by IntelliJ IDEA.
  User: Enoxs
  Date: 2018/12/27
  Time: 下午 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>處理請求URL註解測試</title>
</head>
<body>
<h2>處理請求URL註解測試</h2>
<a href="pathVariableTest/1">測試@PathVariable註解</a><br><br>
<a href="matrixVariableTest/1;name=jack;age=23">測試@MatrixVariable註解</a><br><br>
<a href="productTest/computer;brand=apple,acer;low=2000;height=10000">商品條件查詢（品牌，價格區間）</a><br><br>
<p>如果你看到 「HTTP Status 404 – Not Found」 是正常的! </p>
<p>去確認控制台數值有沒有進來!</p>

<a href="http://localhost:8080/CrossOrigin/welcome">@CrossOrigin 註解使用</a>(CrossOriginController)
<p>教材範例就是放在這個地方</p>
</body>
</html>
