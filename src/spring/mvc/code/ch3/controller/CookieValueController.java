package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * 請求 Cookie 數據映射到功能處理方法的參數上
 */
@Controller
public class CookieValueController {
    @GetMapping(value="/cookieValueTest")
    public void cookieValueTest(
            @CookieValue(value="JSESSIONID", defaultValue="") String sessionId) {
        System.out.println("通過 @CookieValue 取得 JSESSIONID： " + sessionId);
    }
}
