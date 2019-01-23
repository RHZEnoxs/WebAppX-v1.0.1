package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Code Example : Ch3 - ModelAttribute
 *
 * @ModelAttribute 註解用於將請求參數綁訂到對象
 */
// Controller註解用於指示該類是一個控制器，可以同時處理多個請求動作
@Controller
@RequestMapping({"/modelAttributeForm"})
public class ModelAttribute2Controller {
    private static String filePath = "code_ch3/modelAttribute/";
    /**
     * Date : 2019-01-24
     * Code Example Ch3 - ModelAttribute 2
     *
     * ModelAttribute2Controller
     * model屬性名稱和model屬性對象由model.addAttribute()實現，前提是要在方法中加入一個Model類型的參數。
     * 注意：當URL或者post中不包含對應的參數時，程序會拋出異常。
     *
     * VOID
     * 參數(Param) 設置 模組(Model)
     */

    @ModelAttribute
    public void userModel2(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model) {
        System.out.println("userModel2 Method: loginname + password");
        model.addAttribute("loginname", loginname);
        model.addAttribute("password", password);
    }

    @RequestMapping(value = "/login2")
    public String login2() {
        return filePath + "result2";
    }
}
