package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controllerAdvice")
public class ControllerAdviceBookController {
    @GetMapping("/find")
    public String find() throws Exception{
        int i = 5/0;
        return "success";
    }

}
