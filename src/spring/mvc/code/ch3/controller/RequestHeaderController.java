package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * Code Example : Ch3 - RequestHeader
 */
@Controller
public class RequestHeaderController {
    /**
     * Date : 2019-01-23
     * Code Example Ch3 - RequestHeader
     *
     * 用於請求標頭(Header)訊息映射數據
     * 測試@RequestHeader註解
     *
     */
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
    /**
     * 若看到印出類似以下訊息代表成功:
     *
     * 通過@requestHeaderTest獲得User-Agent： Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36
     * 通過@requestHeaderTest獲得Accept：
     * text/html
     * application/xhtml+xml
     * application/xml;q=0.9
     * image/webp
     * image/apng
     * ;q=0.8
     */

}
