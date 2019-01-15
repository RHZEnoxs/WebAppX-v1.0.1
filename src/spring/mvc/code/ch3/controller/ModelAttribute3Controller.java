package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.code.ch3.domain.User;

import java.util.ArrayList;
import java.util.List;


/**
 * @ModelAttribute 註解用於將請求參數綁訂到對象
 */
// Controller註解用於指示該類是一個控制器，可以同時處理多個請求動作
@Controller
@RequestMapping({"/modelAttributeForm"})
public class ModelAttribute3Controller {
    private static String filePath = "code_ch3/modelAttribute/";
    /**
     * ModelAttribute3Controller
     */
    // 靜態List<User>集合，此處代替數據庫用來保存註冊的用戶信息
    private static List<User> userList;

    // UserController類的構造器，初始化List<User>集合
    public ModelAttribute3Controller() {
        super();
        userList = new ArrayList<User>();
        User user1 = new User("Admin", "0000", "管理員");
        User user2 = new User("Enoxs", "0908100", "EnO_O");
        User user3 = new User("RHZ", "02041234", "Rhz~!!!");
        // 存儲User用戶，用於模擬數據庫數據
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }


    // 根據登錄名和密碼查詢用戶，用戶存在返回包含用戶信息的User對象，不存在返回null
    public User find(String loginname, String password) {
        for (User user : userList) {
            if (user.getLoginname().equals(loginname) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    // model屬性的名稱沒有指定，它由返回類型隱含表示，如這個方法返回User類型，那麼這個model屬性的名稱是user。
    // 這個例子中model屬性名稱由返回對像類型隱含表示，model屬性對象就是方法的返回值。它不需要指定特定的參數。
    @ModelAttribute
    public User userModel3(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password) {
        return find(loginname, password);
    }

    @RequestMapping(value = "/login3")
    public String login3() {
        return filePath + "result3";
    }


}
