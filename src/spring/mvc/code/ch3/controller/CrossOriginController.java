package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Code Example : Ch3 - CrossOrigin
 *
 * @CrossOrigin 註解的使⽤
 */
@CrossOrigin(maxAge=3600)
@Controller
public class CrossOriginController {
    private static String filePath = "code_ch3/";
    /**
     * Date : 2019-01-20
     * Code Example Ch3 - CrossOrigin
     */
    // 測試 @CrossOrigin 註解
    @CrossOrigin(origins="http://localhost:8080")
    @GetMapping(value="CrossOrigin/welcome")
    public String welcome() {
        System.out.println("處理跨域請求");
        return filePath + "crossOriginPage";
    }
}
