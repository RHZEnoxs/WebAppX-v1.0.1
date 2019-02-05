package spring.mvc.code.ch3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping("exception")
public class ExceptionController {

    @GetMapping("/hello")
    public String hello() throws Exception{
        // 拋出異常
        throw new Exception();
    }

    @GetMapping("/test")
    public String test() throws Exception{
        // 模擬異常
        int i = 5/0;
        return "success";
    }

    @GetMapping("/find")
    public String find() throws Exception{
        try {
            // 模擬異常
            int i = 5/0;
            return "success";
        } catch (Exception e) {
            throw new SQLException("查找數據失敗(SQL)!");
        }

    }
}
