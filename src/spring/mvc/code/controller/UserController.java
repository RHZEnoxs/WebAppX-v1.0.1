package spring.mvc.code.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.code.domain.User;

import java.util.ArrayList;
import java.util.List;


/**
 * Code Ch3 Example - RequestMappingTest
 * @RequestMapping 和 @RequestParam 註解的使用 (RequestMappingTest)
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
    private static List<User> userList;
    public UserController() {
        super();
        userList = new ArrayList<User>();
    }

    // 該方法支持GET請求
    @GetMapping(value="/register")
    public String registerForm() {
        System.out.println("register GET方法被調用...");
        // 跳轉到註冊頁面
        return "user/registerForm";
    }

    // 該方法支持POST請求
    @PostMapping(value="/register")
    public String register(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            @RequestParam("username") String username) {
        System.out.println("register POST方法被调用...");
        // 創建 User 對象
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);
        // 模擬數據庫存儲User 訊息
        userList.add(user);
        // 跳轉到登入頁面
        return "user/loginForm";
    }

    @RequestMapping("/login")
    public String login(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model) {
        System.out.println("帳號:"+loginname + " 密碼:" + password);
        // 模擬數據驗證
        for(User user : userList){
            if(user.getLoginname().equals(loginname)
                    && user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "user/welcome";
            }
        }
        return "user/loginForm";
    }

}
