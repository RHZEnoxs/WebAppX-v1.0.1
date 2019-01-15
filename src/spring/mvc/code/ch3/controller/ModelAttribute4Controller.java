package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @ModelAttribute 註解用於將請求參數綁訂到對象
 * 無法運行，原因不明
 */
// Controller註解用於指示該類是一個控制器，可以同時處理多個請求動作
@Controller
@RequestMapping({"/modelAttributeForm"})
public class ModelAttribute4Controller {
    private static String filePath = "code_ch3/modelAttribute/";
    /**
     * ModelAttribute4Controller
     * 這時這個方法的返回值並不是表示一個視圖名稱，而是model屬性的值，視圖名稱是@RequestMapping的value值。
     * Model屬性名稱由@ModelAttribute(value=””)指定，相當於在request中封裝了username（key）=admin（value）。
     * */

    @RequestMapping(value="/login4")
    @ModelAttribute(value="username")
    public String login4() {
        return "admin";
    }

}
