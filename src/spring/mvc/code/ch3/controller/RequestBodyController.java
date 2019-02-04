package spring.mvc.code.ch3.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.code.ch3.domain.Book;

import javax.servlet.http.HttpServletResponse;

/**
 * Code Example : Ch3 - RequestBody
 * Code Example : Ch3 - FastJsonTest
 */
@Controller
@RequestMapping("/requestBody")
public class RequestBodyController {
    /**
     * Date : 2019-02-04
     * Code Example Ch3 - RequestBody
     *
     * RequestBodyController
     * lib -> Jackson
     */
    // @RequestBody根據JSON數據，轉換成對應的對象
    @RequestMapping(value="/taskRequestBody")
    public void taskRequestBody(@RequestBody Book book,
                        HttpServletResponse response) throws Exception{
        // ObjectMapper類是Jackson庫的主要類。它提供一些功能將Java對象轉換成對應的JSON格式的數據
        ObjectMapper mapper = new ObjectMapper();
        // 將book對象轉換成json輸出
        System.out.println(mapper.writeValueAsString(book) );
        book.setAuthor("Enoxs");
        response.setContentType("text/html;charset=UTF-8");
        // 將book對象轉換成json寫出到客戶端
        response.getWriter().println(mapper.writeValueAsString(book));
    }
    /**
     * Date : 2019-02-04
     * Code Example Ch3 - FastJson
     *
     * RequestBodyController
     * lib -> fastJson
     */

    // @RequestBody根據json數據，轉換成對應的Object
    @RequestMapping(value="/taskFastJSON")
    public void setJson(@RequestBody Book book,
                        HttpServletResponse response) throws Exception{
        // JSONObject-lib包是一個beans,collections,maps,java arrays和xml和JSON互相轉換的包。
        // 使用JSONObject將book對象轉換成json輸出
        System.out.println(JSONObject.toJSONString(book));
        book.setAuthor("RHZ");
        response.setContentType("text/html;charset=UTF-8");
        // 將book對象轉換成json寫出到客戶端
        response.getWriter().println(JSONObject.toJSONString(book));
    }

}
