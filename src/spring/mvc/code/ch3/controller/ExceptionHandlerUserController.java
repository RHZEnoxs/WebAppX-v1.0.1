package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;



@Controller
@RequestMapping("/exceptionHandler")
public class ExceptionHandlerUserController extends BaseController{
    @GetMapping("/login")
    public String login(String username) throws Exception{
        if(username == null ){
            throw new NullPointerException("用戶名不存在!");
        }
        return "success";
    }
}
