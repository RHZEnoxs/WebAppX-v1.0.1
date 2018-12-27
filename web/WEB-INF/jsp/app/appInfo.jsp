<%--
  Created by IntelliJ IDEA.
  User: enoxs
  Date: 2018/12/12
  Time: 1:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Application Information</title>
    <script src="../../static/jquery/jquery.js"></script>
    <script src="../../static/bootstrap/js/bootstrap.js"></script>
    <link href="../../static/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="../../static/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
    <script src="../../static/plugin/moment.min.js"></script>
</head>
<body>
<h3>Ajax</h3>
<p></p>
<div id='divPostVar'>
    <button id='btnPostInteger'>Post Integer</button>
    <button id='btnPostLong'>Post Long</button>
    <button id='btnPostString'>Post String</button>
    <button id='btnPostMoreParam'>Post More Param</button>
</div>
<div id="divPostCollect">
    <button id='btnPostIntegerArray'>Post Integer Array</button>
    <button id='btnPostStringArray'>Post String Array </button>
    <br>
    <button id='btnPostIntegerList'>Post List Integer </button>
    <button id='btnPostStringList'>Post List String </button>
</div>
<br>
<div id="divQunit">
    <button class="btn btn-primary" id="btnQUnit"><a href="appInfo/qunitSE">測試 ModelAndViewTest</a></button>
</div>

</body>
</html>

<script>
    $divPost = $('#divPostVar');
    $divPostCollect = $('#divPostCollect');
    $divQunit = $('#divQunit');

    $btnPostInteger = $divPost.find('#btnPostInteger');
    $btnPostLong = $divPost.find('#btnPostLong');
    $btnPostString = $divPost.find('#btnPostString');
    $btnPostMoreParam = $divPost.find('#btnPostMoreParam');

    $btnPostIntegerArray = $divPostCollect.find('#btnPostIntegerArray');
    $btnPostStringArray = $divPostCollect.find('#btnPostStringArray');
    $btnPostIntegerList = $divPostCollect.find('#btnPostIntegerList');

    $btnQUnit = $divQunit.find('#btnQUnit');


    $btnPostInteger.off('click').on('click', function () {
        var postUrl = 'appInfo/postInteger';
        var formData = {
            id: 1
        };
        $.post(postUrl, formData, function (data, status) {
            var response = JSON.parse(decodeURIComponent(data));
            if (response.status == 'success') {
                alert(response.desc);
                console.log(response.list);
            } else {
                alert(response.desc);
            }
        }).always(function () {
        });
    });
    $btnPostLong.off('click').on('click', function () {
        var postUrl = 'appInfo/postLong';
        var formData = {
            id: 1
        };
        $.post(postUrl, formData, function (data, status) {
            var response = JSON.parse(decodeURIComponent(data));
            if (response.status == 'success') {
                alert(response.desc);
                console.log(response.list);
            } else {
                alert(response.desc);
            }
        }).always(function () {
        });
    });
    $btnPostString.off('click').on('click', function () {
        var postUrl = 'appInfo/postString';
        var formData = {
            msg: 'msg#1'
        };
        $.post(postUrl, formData, function (data, status) {
            console.log(status);
            var response = JSON.parse(decodeURIComponent(data));
            if (response.status == 'success') {
                alert(response.desc);
                console.log(response.list);
            } else {
                alert(response.desc);
            }
        }).always(function () {
        });
    });
    $btnPostMoreParam.off('click').on('click', function () {
        var postUrl = 'appInfo/postMoreParam';
        var formData = {
            id: 2,
            msg: 'msg#2'
        };
        $.post(postUrl, formData, function (data, status) {
            console.log(status);
            var response = JSON.parse(decodeURIComponent(data));
            if (response.status == 'success') {
                alert(response.desc);
                console.log(response.list);
            } else {
                alert(response.desc);
            }
        }).always(function () {
        });
    });

    $btnPostIntegerArray.off('click').on('click',function(){
        var dataArray = new Array();
        dataArray.push(1);
        dataArray.push(2);
        dataArray.push(3);
        dataArray.push(4);
        dataArray.push(5);

        var postUrl = 'appInfo/postIntegerArray';
        var formData = {
            postArray : dataArray
        };
        $.post(postUrl, formData, function (data, status) {
            console.log(status);
            var response = JSON.parse(decodeURIComponent(data));
            if (response.status == 'success') {
                alert(response.desc);
                console.log(response.list);
            } else {
                alert(response.desc);
            }
        }).always(function () {
        });
    });
    $btnPostStringArray.off('click').on('click',function(){
        var dataArray = new Array();
        dataArray.push('msg#1');
        dataArray.push('msg#2');
        dataArray.push('msg#3');
        dataArray.push('msg#4');
        dataArray.push('msg#5');

        var postUrl = 'appInfo/postStringArray';
        var formData = {
            postArray : dataArray
        };
        $.post(postUrl, formData, function (data, status) {
            console.log(status);
            var response = JSON.parse(decodeURIComponent(data));
            if (response.status == 'success') {
                alert(response.desc);
                console.log(response.list);
            } else {
                alert(response.desc);
            }
        }).always(function () {
        });
    });

    $btnPostIntegerList.off('click').on('click',function(){
        var lstNumber = new Array();
        lstNumber.push(1);
        lstNumber.push(2);
        lstNumber.push(3);
        lstNumber.push(4);
        lstNumber.push(5);

        var postUrl = 'appInfo/postListInteger';
        var formData = JSON.stringify(lstNumber);
        $.ajax({
            type: "POST",
            url: postUrl,
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: formData,
            success: function(response) {
                console.log(response);
                // alert(response);
            },
            error: function(resp) {
                alert(resp)
            }
        });
    });

    $btnQUnit.off('click').on('click',function(){

    });
</script>
