<%--
  Created by IntelliJ IDEA.
  User: enoxs
  Date: 2018/12/11
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第三章 Spring MVC 的常用註解</title>
    <script src="../../static/jquery/jquery.js"></script>
    <script src="../../static/bootstrap/js/bootstrap.js"></script>
    <link href="../../static/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="../../static/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
    <script src="../../static/plugin/moment.min.js"></script>
    <script src="../../static/plugin/json2.js"></script>
</head>
<body>
<div id="content" style="margin:5px 10px 15px 20px">
    <h2>第三章 Spring MVC 的常用註解</h2>
    <h3>0.@Controller 註解</h3>
    <a href="helloWorld"> @Controller 註解</a>(ModelController)
    <br>
    <h3>1.@RequestMapping 註解</h3>
    <a href="model"> @RequestMapping 註解</a>(ModelController)
    <br>
    <h3>2.@RequestParam 註解</h3>
    <a href="requestMapping/register">@RequestMapping 註解</a>(RequestMappingController)
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
                <td><input type="text" id="loginname" name="loginname"></td>
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
    #7.1 <a href="modelAttributeForm/loginForm1">測試 @ModelAttribute(value="") 註釋返回具體類的方法 </a><br>
    #7.2 <a href="modelAttributeForm/loginForm2">測試 @ModelAttribute 註釋 void 返回值的方法</a><br>
    #7.3 <a href="modelAttributeForm/loginForm3">測試 @ModelAttribute 註釋返回具體類的方法</a><br>
    #7.4 <a href="modelAttributeForm/loginForm4">測試 @ModelAttribute 和 @RequestMapping 同時註釋一個方法</a><br>
    #7.5 <a href="modelAttributeForm/loginForm5">測試 @ModelAttribute 註釋一個方法的參數</a>

    <h3>8.@RequestBody 註解</h3>
    <strong><b>@RequestBody 接收JSON 格式的數據 (RequestBodyTest)</b></strong>
    <div id="requestBodyDiv">
        編號：<span id="requestBodyId"></span><br>
        書名：<span id="requestBodyName"></span><br>
        作者：<span id="requestBodyAuthor"></span><br>
        <button id="requestBodyBtn">RequestBody</button>
    </div>
    <br>
    <strong><b>自定義 HttpMessageConverter 接收 JSON 格式的數據 (FastjsonTest)</b></strong>
    <div id="fastJsonDiv">
        編號：<span id="fastJsonId"></span><br>
        書名：<span id="fastJsonName"></span><br>
        作者：<span id="fastJsonAuthor"></span><br>
        <button id="fastJsonBtn">RequestBody</button>
    </div>

    <h3>9.@ResponseBody 註解</h3>
    <span><strong><b>@ResponseBody 返回 JSON 格式的數據 (ResponseBodyTest)</b></strong></span>
    <div id="responseBodyDiv">
        <table id="responseBodyTable" border="1" style="border-collapse: collapse;">
            <tr align="center">
                <th>編號</th>
                <th>書名</th>
                <th>作者</th>
            </tr>
        </table>
        <button id="responseBodyBtn">ResponseBody</button>
    </div>
    <span><strong><b>@ResponseBody 返回 JSON 格式的數據 (ResponseBodyTest)</b></strong></span>
    <div id="fastJson2Div">
        <table id="fastJsonTable" border="1" style="border-collapse: collapse;">
            <tr align="center">
                <th>編號</th>
                <th>書名</th>
                <th>作者</th>
            </tr>

        </table>
        <button id="fastJson2Btn">ResponseBody</button>
    </div>
    <h3>10. 轉換 XML 數據 (Skip...)</h3>
    <div>
        <span><strong><b>接收 XML 格式的數據 (XmlTest)</b></strong></span>
        <button id="sendXmlBtn">Send XML</button>
    </div>
    <div>
        <span><strong><b>返回 XML 格式的數據 (XmlTest)</b></strong></span>
        <button id="readXmlBtn">Read XML</button>
    </div>
    <h3>11. @RestController 註解</h3>
    <div id="restDiv">
        <table id="restTable" border="1" style="border-collapse: collapse;">
            <tr align="center">
                <th>編號</th>
                <th>書名</th>
                <th>作者</th>
            </tr>
        </table>
        <button id="restBtn">Rest.(Controller)</button>
    </div>
    <h3>12. Spring MVC 異常處理接口以及實現類 </h3>
    <a href="exception/hello">沒有異常處理</a><br>
    <a href="exception/test">使用簡單異常處理器處理異常</a><br>
    <a href="exception/find">使用簡單異常處理器處理特定異常</a><br>
    <h3>13. @ResponseStatus 註解</h3>
    <a href="responseStatus/find">@ResponseStatus異常處理</a>
    <h3>14. </h3>
    <a href="exceptionHandler/test">@ExceptionHandler處理異常</a>
    <hr>
    <a href="exceptionHandler/login">UserController：父級Controller異常處理</a><br>
    <a href="exceptionHandler/find">BookController：父級Controller異常處理</a><br>
    <h3>15. ControllerAdvice 註解</h3>
    <a href="controllerAdvice/find">@ControllerAdvice異常處理</a><br><br>
    <hr>
    <button id="searchBtn">查詢訂單（返回JSON）</button>

    <br><br><br>
    <br><br><br>

    <script src="js/chapter3.js"></script>
</div>
</body>
</html>
