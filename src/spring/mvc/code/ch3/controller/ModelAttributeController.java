package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import spring.mvc.code.ch3.domain.User;

import java.util.ArrayList;
import java.util.List;


/**
 * @ModelAttribute 註解用於將請求參數綁訂到對象
 */
// Controller註解用於指示該類是一個控制器，可以同時處理多個請求動作
@Controller
//@RequestMapping({"/modelAttribute"})
public class ModelAttributeController {
    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName){
        System.out.println("動態跳轉: "  + formName);
        return  formName;
    }

    /**
     * ModelAttribute1Controller
     * 使用@ModelAttribute註釋的value屬性，來指定model屬性的名稱,model屬性對象就是方法的返回值
     */
    @ModelAttribute("loginname")
    public String userModel1(
            @RequestParam("loginname") String loginname){
        return loginname;
    }
//
//    @RequestMapping(value="/login1")
//    public String login1() {
//        return "result1";
//    }


//    /**
//     * ModelAttribute2Controller
//     */
//
//    // model屬性名稱和model屬性對象由model.addAttribute()實現，前提是要在方法中加入一個Model類型的參數。
//    // 注意：當URL或者post中不包含對應的參數時，程序會拋出異常。
//    @ModelAttribute
//    public void userModel2(
//            @RequestParam("loginname") String loginname,
//            @RequestParam("password") String password,
//            Model model) {
//        model.addAttribute("loginname", loginname);
//        model.addAttribute("password", password);
//    }
//
//    @RequestMapping(value = "/login2")
//    public String login2() {
//        return filePath + "result2";
//    }
//
//    /**
//     * ModelAttribute3Controller
//     */
//    // 靜態List<User>集合，此處代替數據庫用來保存註冊的用戶信息
//    private static List<User> userList;
//
//    // UserController類的構造器，初始化List<User>集合
//    public ModelAttributeController() {
//        super();
//        userList = new ArrayList<User>();
//        User user1 = new User("test", "123456", "测试用户");
//        User user2 = new User("admin", "123456", "管理员");
//        // 存儲User用戶，用於模擬數據庫數據
//        userList.add(user1);
//        userList.add(user2);
//    }
//
//    // 根據登錄名和密碼查詢用戶，用戶存在返回包含用戶信息的User對象，不存在返回null
//    public User find(String loginname, String password) {
//        for (User user : userList) {
//            if (user.getLoginname().equals(loginname) && user.getPassword().equals(password)) {
//                return user;
//            }
//        }
//        return null;
//    }
//
//    // model屬性的名稱沒有指定，它由返回類型隱含表示，如這個方法返回User類型，那麼這個model屬性的名稱是user。
//    // 這個例子中model屬性名稱由返回對像類型隱含表示，model屬性對象就是方法的返回值。它不需要指定特定的參數。
//    @ModelAttribute
//    public User userModel3(
//            @RequestParam("loginname") String loginname,
//            @RequestParam("password") String password) {
//        return find(loginname, password);
//    }
//
//    @RequestMapping(value = "/login3")
//    public String login3() {
//        return filePath + "result3";
//    }
//
//    /**
//     * ModelAttribute4Controller
//     * 這時這個方法的返回值並不是表示一個視圖名稱，而是model屬性的值，視圖名稱是@RequestMapping的value值。
//     * Model屬性名稱由@ModelAttribute(value=””)指定，相當於在request中封裝了username（key）=admin（value）。
//     * */
//
//    @RequestMapping(value="/login4")
//    @ModelAttribute(value="username")
//    public String login4() {
//        return filePath + "admin";
//    }
//
//    /**
//     * ModelAttribute5Controller
//     * @ModelAttribute 註釋方法參數，會自動帶入參
//     * loginname控件的值會自動入參到User的loginname屬性
//     * password控件的值會自動入參到User的password屬性
//     * */
//
//    @RequestMapping(value="/login5")
//    public String login5(@ModelAttribute User user) {
//        user.setUsername("管理員");
//        return filePath + "result5";
//    }
}
