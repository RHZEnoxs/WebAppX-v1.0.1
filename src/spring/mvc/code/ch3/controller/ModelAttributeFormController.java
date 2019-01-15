package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/modelAttributeForm"})
public class ModelAttributeFormController {
    private static String filePath = "code_ch3/modelAttribute/";
    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName){
        System.out.println("動態跳轉: " + filePath + formName);
        return  filePath + formName;
    }
}
