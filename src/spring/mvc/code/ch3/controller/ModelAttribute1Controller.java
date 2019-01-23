package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import spring.mvc.code.ch3.domain.User;

import java.util.ArrayList;
import java.util.List;


/**
 * Code Example : Ch3 - ModelAttribute
 *
 * @ModelAttribute 註解用於將請求參數綁訂到對象
 */
// Controller註解用於指示該類是一個控制器，可以同時處理多個請求動作
@Controller
@RequestMapping({"/modelAttributeForm"})
public class ModelAttribute1Controller {
    private static String filePath = "code_ch3/modelAttribute/";
    /**
     * Date : 2019-01-24
     * Code Example Ch3 - ModelAttribute 1
     *
     * ModelAttribute1Controller
     * 使用@ModelAttribute註釋的value屬性，來指定model屬性的名稱,model屬性對象就是方法的返回值
     *
     * VALUE
     * 參數(Param) 綁 屬性(Attribute)
     */

    @ModelAttribute("loginname")
    public String userModel1(
            @RequestParam("loginname") String loginname){
        System.out.println("userModel1 Method: loginname");
        return loginname;
    }

    @RequestMapping(value="/login1")
    public String login1() {
        System.out.println("login1 Method#");
        return filePath + "result1";
    }
}
