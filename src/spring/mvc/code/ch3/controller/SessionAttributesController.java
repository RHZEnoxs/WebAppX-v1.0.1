package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import spring.mvc.code.ch3.domain.User;

/**
 * Code Example : Ch3 - SessionAttributes
 *
 * 將Model中的屬性名為user的轉存HttpSession對象當中
 */
@Controller
@SessionAttributes("user")
@RequestMapping({ "/sessionAttributes" })
public class SessionAttributesController {
    private static String filePath = "code_ch3/";
    /**
     * Date : 2019-01-23
     * Code Example Ch3 - SessionAttributes
     */
    @RequestMapping(value="/login")
    public String login(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model ) {
        // 創建User對象，裝載用戶信息
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername("admin");
        // 將user對象添加到Model當中
        model.addAttribute("user",user);
        return filePath + "sessionAttributesPage";
    }


}
