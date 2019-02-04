$(function () {
    var $requestBodyDiv = $('#requestBodyDiv');
    var $fastJsonDiv = $('#fastJsonDiv');
    var $responseBodyDiv = $('#responseBodyDiv');
    var $fastJson2Div = $('#fastJson2Div');
    var $xmlDiv = $('#xmlDiv');

    var $requestBodyBtn = $requestBodyDiv.find("#requestBodyBtn");
    var $fastJsonBtn = $fastJsonDiv.find("#fastJsonBtn");
    var $responseBodyBtn = $responseBodyDiv.find('#responseBodyBtn');
    var $fastJson2Btn = $fastJson2Div.find('#fastJson2Btn');

    var $sendXmlBtn = $xmlDiv.find('#sendXmlBtn');
    var $readXmlBtn = $xmlDiv.find('#readXmlBtn');


    $requestBodyBtn.off('click').on('click', function () {
        taskRequestBody();
    });

    $fastJsonBtn.off('click').on('click', function () {
        taskFastJson();
    });

    $responseBodyBtn.off('click').on('click', function () {
        taskResponseBody();
    });

    $fastJson2Btn.off('click').on('click', function () {
        taskFastJson2();
    });

    $sendXmlBtn.off('click').on('click', function () {
        taskSendXml();
    });

    $readXmlBtn.off('click').on('click', function () {
        taskReadXml();
    });

    var taskRequestBody = function () {
        var $id = $requestBodyDiv.find("#requestBodyId");
        var $name = $requestBodyDiv.find("#requestBodyName");
        var $author = $requestBodyDiv.find("#requestBodyAuthor");
        // 書本範例 -> 無作用：${pageContext.request.contextPath}
        // var postUrl = "${pageContext.request.contextPath}/json/testRequestBody";
        $.ajax("requestBody/taskRequestBody",// 發送請求URL的字符串。
            {
                dataType: "json", // 預期服務器返回的數據類型。
                type: "post", //  請求方式 POST 或 GET
                contentType: "application/json", //  發送信息至服務器時的內容編碼類型
                // 發送到服務器的數據。
                data: JSON.stringify({id: 1, name: "Spring MVC + MyBatis"}),
                async: true, // 默認設置下，所有請求均為異步請求。如果設置為 false ，則發送同步請求。
                // 請求成功後的回調函數。
                success: function (data) {
                    console.log(data);
                    $id.html(data.id);
                    $name.html(data.name);
                    $author.html(data.author);
                },
                // 请求出错时调用的函数
                error: function () {
                    alert("數據發送失敗");
                }
            });
    }

    var taskFastJson = function () {
        var $id = $fastJsonDiv.find("#fastJsonId");
        var $name = $fastJsonDiv.find("#fastJsonName");
        var $author = $fastJsonDiv.find("#fastJsonAuthor");
        $.ajax("requestBody/taskFastJSON",// 發送請求的URL字符串。
            {
                dataType: "json", // 預期服務器返回的數據類型。
                type: "post", //  請求方式 POST或GET
                contentType: "application/json", //  發送信息至服務器時的內容編碼類型
                // 發送到服務器的數據。
                data: JSON.stringify({id: 2, name: "Spring MVC + MyBatis"}),
                async: true, // 默認設置下，所有請求均為異步請求。如果設置為false，則發送同步請求
                // 請求成功後的回調函數。
                success: function (data) {
                    console.log(data);
                    $id.html(data.id);
                    $name.html(data.name);
                    $author.html(data.author);
                },
                // 請求出錯時調用的函數
                error: function () {
                    alert("數據發送失敗");
                }
            });
    }

    var taskResponseBody = function () {
        var $responseBodyTable = $responseBodyDiv.find('#responseBodyTable');
        $.post("responseBody/taskResponseBody", null,
            function (data) {
                $.each(data, function () {
                    var tr = $("<tr align='center'/>");
                    $("<td/>").html(this.id).appendTo(tr);
                    $("<td/>").html(this.name).appendTo(tr);
                    $("<td/>").html(this.author).appendTo(tr);
                    $responseBodyTable.append(tr);
                })
            }, "json");
    }

    var taskFastJson2 = function () {
        var $fastJsonTable = $fastJson2Div.find('#fastJsonTable');
        $.post("responseBody/taskFastJSON2", null,
            function (data) {
                $.each(data, function () {
                    var tr = $("<tr align='center'/>");
                    $("<td/>").html(this.id).appendTo(tr);
                    $("<td/>").html(this.name).appendTo(tr);
                    $("<td/>").html(this.author).appendTo(tr);
                    $fastJsonTable.append(tr);
                })
            }, "json");
    }

    var taskSendXml = function () {
        alert('OwO');
        var xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><book><id>1</id><name>疯狂Java讲义</name><author>李刚</author></book>";
        $.ajax("sendXml",// 发送请求的URL字符串。
            {
                type: "POST", //  请求方式 POST或GET
                contentType: "application/xml", //  发送信息至服务器时的内容编码类型
                // 发送到服务器的数据。
                data: xmlData,
                async: true ,// 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
            });
    }

    var taskReadXml = function () {
        $.ajax("/readXml",// 發送請求的URL字符串。
            {
                dataType: "text", // 預期服務器返回的數據類型。
                type: "POST", //  請求方式 POST或GET
                async: true, // 默認設置下，所有請求均為異步請求。如果設置為false，則發送同步請求
                // 請求成功後的回調函數。
                success: function (xml) {
                    // 獲得xml數據的id，name，author
                    var id = $("id", xml).text();
                    var name = $("name", xml).text();
                    var author = $("author", xml).text();
                    var tr = $("<tr align='center'/>");
                    $("<td/>").html(id).appendTo(tr);
                    $("<td/>").html(name).appendTo(tr);
                    $("<td/>").html(author).appendTo(tr);
                    $("#readXmlTable").append(tr);
                },
                // 請求出錯時調用的函數
                error: function () {
                    alert("數據接收失敗");
                }
            });

    }


});