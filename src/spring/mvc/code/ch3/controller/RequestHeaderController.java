package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class RequestHeaderController {
    /**
     * 用於請求標頭(Header)訊息映射數據
     *
     */
    // 測試@RequestHeader註解
    // 該方法映射的請求為 /requestHeaderTest
    @GetMapping(value="/requestHeaderTest")
    public void requestHeaderTest(
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader(value="Accept") String[] accepts) {
        System.out.println("通過@requestHeaderTest獲得User-Agent： " + userAgent);
        System.out.println("通過@requestHeaderTest獲得Accept： ");
        // 循環輸出頭信息
        for(String accept : accepts){
            System.out.println(accept);
        }
    }
}
