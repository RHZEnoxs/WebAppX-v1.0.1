package spring.mvc.code.ch4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.code.ch4.domain.*;
import spring.mvc.code.ch4.validator.UserValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/jspTag")
public class Ch4_UserController {

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


    @GetMapping(value="/checkboxesForm")
    public String checkboxesForm(Model model) {
        UserChks user = new UserChks();
        // 為集合變量courses添加“JAVAEE”和“Spring”，頁面的checkbox複選框這兩項會被選中
        List<String> list = new ArrayList<String>();
        list.add("JAVAEE");
        list.add("Spring");
        user.setCourses(list);
        // 頁面展現的可供選擇的複選框內容courseList
        List<String> courseList = new ArrayList<String>();
        courseList.add("JAVAEE");
        courseList.add("Mybatis");
        courseList.add("Spring");
        // model中添加屬性user和courseList
        model.addAttribute("user",user);
        model.addAttribute("courseList",courseList);
        return "code_ch4/checkboxes/checkboxesForm";
    }

    @GetMapping(value="/checkboxesForm2")
    public String checkboxesForm2(Model model) {
        UserChks user = new UserChks();
        // 為集合變量courses添加“JAVAEE”和“Spring”，頁面的checkbox複選框這兩項會被選中
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("3");
        user.setCourses(list);
        // 頁面展現的可供選擇的複選框內容courseList
        Map<String, String> courseMap = new HashMap<String, String>();
        courseMap.put("1","JAVAEE");
        courseMap.put("2","Mybatis");
        courseMap.put("3","Spring");
        // model中添加屬性user和courseList
        model.addAttribute("user",user);
        model.addAttribute("courseMap",courseMap);
        return "code_ch4/checkboxes/checkboxesForm2";
    }

    @GetMapping(value="/checkboxesForm3")
    public String checkboxesForm3(Model model) {
        EmployeeChks employee = new EmployeeChks();
        DeptChks dept = new DeptChks(1,"開發部");
        // 為集合變量depts添加Dept對象，該對象id=1，name=開發吧，頁面的checkbox複選框這一項會被選中
        List<DeptChks> list = new ArrayList<DeptChks>();
        list.add(dept);
        employee.setDepts(list);
        // 頁面展現的可供選擇的複選框內容deptList
        List<DeptChks> deptList = new ArrayList<DeptChks>();
        deptList.add(dept);
        deptList.add(new DeptChks(2,"銷售部"));
        deptList.add(new DeptChks(3,"財務部"));
        // model中添加屬性employee和deptList
        model.addAttribute("employee",employee);
        model.addAttribute("deptList",deptList);
        return "code_ch4/checkboxes/checkboxesForm3";
    }

    @GetMapping(value="/radiobuttonForm")
    public String radiobuttonForm(Model model) {
        UserRadio user = new UserRadio();
        // 設置sex變量的值為男，頁面的radio單選框的value=男會被選中
        user.setSex("女");
        model.addAttribute("user", user);
        return "code_ch4/radiobutton/radiobuttonForm";
    }

    @GetMapping(value="/radiobuttonsForm")
    public String radiobuttonsForm(Model model) {
        UserRadio user = new UserRadio();
        // 設置sex變量的值為男，頁面的radio單選框的value=男會被選中
        user.setSex("女");
        // 頁面展現的可供選擇的單選框內容sexList
        List<String> sexList = new ArrayList<String>();
        sexList.add("男");
        sexList.add("女");
        model.addAttribute("user", user);
        model.addAttribute("sexList", sexList);
        return "code_ch4/radiobutton/radiobuttonsForm";
    }

    @GetMapping(value="/radiobuttonsForm2")
    public String radiobuttonsForm2(Model model) {
        UserRadio user = new UserRadio();
        // 設置sex變量的值為"1"，頁面的radio單選框的value=男會被選中
        user.setSex("2");
        // 頁面展現的可供選擇的單選框內容sexMap
        Map<String, String> sexMap = new HashMap<String, String>();
        sexMap.put("1", "男");
        sexMap.put("2", "女");
        model.addAttribute("user", user);
        model.addAttribute("sexMap", sexMap);
        return "code_ch4/radiobutton/radiobuttonsForm2";
    }

    @GetMapping(value="/selectForm")
    public String selectForm(Model model) {
        UserSelect user = new UserSelect();
        // 設置deptId的值，頁面的select下拉框對應的option項會被選中
        user.setDeptId(2);
        model.addAttribute("user", user);
        return "code_ch4/select/selectForm";
    }

    @GetMapping(value="/selectForm2")
    public String selectForm2(Model model) {
        UserSelect user = new UserSelect();
        user.setDeptId(2);
        // 頁面展現的可供選擇的select下拉框內容deptMap
        Map<Integer, String> deptMap = new HashMap<Integer, String>();
        deptMap.put(1, "財務部");
        deptMap.put(2, "開發部");
        deptMap.put(3, "銷售部");
        model.addAttribute("user", user);
        model.addAttribute("deptMap", deptMap);
        return "code_ch4/select/selectForm2";
    }

    @GetMapping(value="/selectForm3")
    public String selectForm3(Model model) {
        UserSelect user = new UserSelect();
        user.setDeptId(2);
        // 頁面展現的可供選擇的select下拉框內容deptMap
        Map<Integer, String> deptMap = new HashMap<Integer, String>();
        deptMap.put(1, "財務部");
        deptMap.put(2, "開發部");
        deptMap.put(3, "銷售部");
        model.addAttribute("user", user);
        model.addAttribute("deptMap", deptMap);
        return "code_ch4/select/selectForm3";
    }


    @GetMapping(value="/selectForm4")
    public String selectForm4(Model model) {
        UserSelect user = new UserSelect();
        user.setDeptId(2);
        // 頁面展現的可供選擇的select下拉框內容deptList，其中的元素的Dept對象
        // 模擬從數據庫獲取到部門信息封裝到對象當中
        List<DeptSelect> deptList = new ArrayList<DeptSelect>();
        deptList.add(new DeptSelect(1, "財務部"));
        deptList.add(new DeptSelect(2, "開發部"));
        deptList.add(new DeptSelect(3, "銷售部"));
        model.addAttribute("user", user);
        model.addAttribute("deptList", deptList);
        return "code_ch4/select/selectForm4";
    }

    @GetMapping(value="/registerFormCheck")
    public String registerFormErr(Model model) {
        User user = new User();
        // model中添加屬性user，值是user對象
        model.addAttribute("user",user);
        return "code_ch4/error/registerForm";
    }

    @InitBinder
    public void initBinder(DataBinder binder) {
        // 設置驗證的類為UserValidator
        binder.setValidator(new UserValidator());
    }

    @PostMapping(value="/register")
    public String register(@Validated User user, Errors errors,Model model) {
        // 如果Errors對像有Field錯誤的時候，重新跳回註冊頁面，否則正常提交
        if (errors.hasFieldErrors())
            return "code_ch4/error/registerForm";
        model.addAttribute("message", "Hello World!");
        return "code_ch4/error/submit";
    }
}
