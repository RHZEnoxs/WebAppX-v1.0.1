package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Code Example : Ch3 - CookieValue
 * 請求 Cookie 數據映射到功能處理方法的參數上
 */
@Controller
public class CookieValueController {

    /**
     * Date : 2019-01-23
     * Code Example Ch3 - CookieValue
     */

    @GetMapping(value="/cookieValueTest")
    public void cookieValueTest(
            @CookieValue(value="JSESSIONID", defaultValue="") String sessionId) {
        System.out.println("通過 @CookieValue 取得 JSESSIONID： " + sessionId);
    }
    /**
     * 若看到印出類似以下訊息代表成功:
     *
     * 通過 @CookieValue 取得 JSESSIONID： C5AD839309CF055F37ABAAB881EFC32F
     *
     *
     */
}
