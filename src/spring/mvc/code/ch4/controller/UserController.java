package spring.mvc.code.ch4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.code.ch4.domain.UserChk;
import spring.mvc.code.ch4.domain.UserInfo;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/jspTag")
public class UserController {
    @GetMapping(value="/registerForm")
    public String registerForm(Model model) {
        UserInfo userInfo = new UserInfo("jack","男",28);
        // model中添加屬性command，值是user對象
        model.addAttribute("command", userInfo);
        return "code_ch4/form/registerForm";
    }

    @GetMapping(value="/registerForm2")
    public String registerForm2(Model model) {
        UserInfo userInfo = new UserInfo("jack","男",28);
        // model中添加屬性user，值是user對象
        model.addAttribute("userInfo", userInfo);
        return "code_ch4/form/registerForm2";
    }

    @GetMapping(value="/checkboxForm")
    public String checkboxForm(Model model) {
        UserChk user = new UserChk();
        // 設置boolean變量reader的值為true，頁面的checkbox複選框會被選中
        user.setReader(true);
        // 為集合變量courses添加“JAVAEE”和“Spring”，頁面的checkbox複選框這兩項會被選中
        List<String> list = new ArrayList<String>();
        list.add("JAVAEE");
        list.add("Spring");
        user.setCourses(list);
        // model中添加屬性command，值是user對象
        model.addAttribute("user",user);
        return "code_ch4/checkbox/checkboxForm";
    }

}
