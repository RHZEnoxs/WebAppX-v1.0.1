package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import spring.mvc.code.ch3.domain.User;

@Controller
// 將Model中的屬性名為user的轉存HttpSession對象當中
@SessionAttributes("user")
@RequestMapping({ "/sessionAttributes" })
public class SessionAttributesController {
    // 該方法映射的請求為http://localhost:8080/SessionAttributesTest/login
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
        return "page/sessionAttributesPage";
    }


}
