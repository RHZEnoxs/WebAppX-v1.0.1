<%--
  Created by IntelliJ IDEA.
  User: enoxs
  Date: 2018/12/11
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html
>
<head>
    <title>第三章 Spring MVC 的常用註解</title>
</head>
<body>
<h2>第三章 Spring MVC 的常用註解</h2>
<h3>1.@RequestMapping 註解</h3>
<a href="model"> @RequestMapping 註解</a>(ModelController)
<br><br>
<h3>2.@RequestParam 註解</h3>
<a href="user/register">@RequestMapping 註解</a>(U serController)
<h3>3.@CrossOrigin 註解</h3>
<a href="variable/home">@Path Variable 註解 和 @Matrix Variable 註解的使⽤</a>(VariableController)
<br>
<a href="http://localhost:8080/CrossOrigin/welcome">@CrossOrigin 註解使用</a>(CrossOriginController)
<h3>4.@RequestHeader 註解</h3>
<a href="requestHeaderTest">測試 @RequestHeader註解</a><br><br>
<h3>5.@CookieValue 註解</h3>
<a href="cookieValueTest">測試 @CookieValue注解</a><br><br>
<h3>5.@RequestAttribute和@SessionAttribute 註解</h3>
<a href="attrbuteTest">測試 @RequestAttribute和@SessionAttribute</a><br><br>
<h3>6.@SessionAttributes註解</h3>
<form action="sessionAttributes/login" method="post">
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
<h3>7.@ModelAttribute 註解</h3>
#7.1 <a href="loginForm1">測試 @ModelAttribute(value="") 註釋返回具體類的方法 </a><br>
#7.2 <a href="modelAttribute/loginForm2">測試 @ModelAttribute 註釋 void 返回值的方法</a><br>
#7.3 <a href="modelAttribute/loginForm3">測試 @ModelAttribute 註釋返回具體類的方法</a><br>
#7.4 <a href="modelAttribute/loginForm4">測試 @ModelAttribute 和 @RequestMapping 同時註釋一個方法</a><br>
#7.5 <a href="modelAttribute/loginForm5">測試 @ModelAttribute 註釋一個方法的參數</a><br><br>

</body>
</html>
