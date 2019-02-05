package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
@Controller
@RequestMapping("/exceptionHandler")
public class ExceptionHandlerBookController extends BaseController{
    @GetMapping("/find")
    public String find() throws Exception{
        try {
            int i = 5/0;
            return "success";
        } catch (Exception e) {
            throw new SQLException("查找圖書信息失敗!");
        }
    }
}
