package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.code.ch3.domain.User;


/**
 * @ModelAttribute 註解用於將請求參數綁訂到對象
 */
// Controller註解用於指示該類是一個控制器，可以同時處理多個請求動作
@Controller
@RequestMapping({"/modelAttributeForm"})
public class ModelAttribute5Controller {
    private static String filePath = "code_ch3/modelAttribute/";
    /**
     * ModelAttribute5Controller
     * @ModelAttribute 註釋方法參數，會自動帶入參數
     * loginname控件的值會自動入參到User的loginname屬性
     * password控件的值會自動入參到User的password屬性
     * */

    @RequestMapping(value="/login5")
    public String login5(@ModelAttribute User user) {
        user.setUsername("管理員");
        return filePath + "result5";
    }
}
