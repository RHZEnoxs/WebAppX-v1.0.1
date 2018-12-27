package spring.mvc.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(maxAge=3600)
@Controller
public class CrossOriginController {
    @CrossOrigin(origins="http://localhost:8080")
    @GetMapping(value="CrossOrigin/welcome")
    public String welcome() {
        System.out.println("處理跨域請求");
        return "page/crossOriginPage";
    }
}
