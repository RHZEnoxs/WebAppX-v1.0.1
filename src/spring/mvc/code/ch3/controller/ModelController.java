package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import spring.mvc.code.ch3.domain.User;

/**
 * Code Example : Ch3 - ModelTest
 * Code Example : Ch3 - ModelAndView
 */
@Controller
@RequestMapping({ "/model" })
public class ModelController {
    private static String filePath = "code_ch3/model/";

    @RequestMapping(value = { "" }, method = RequestMethod.GET)
    public ModelAndView home(ModelMap model) {
        ModelAndView view = new ModelAndView(filePath +"home");
        return view;
    }

    /**
     * Date : 2019-01-20
     * Code Example Ch3 - ModelTest
     */

    @RequestMapping(value="/modelTest")
    public String modelTest(Model model){
        System.out.println("modelTest");
        User user = new User();
        // 設置user對象的username屬性
        user.setUsername("Enoxs");
        // 將 User對象添加到ModelMap當中
        model.addAttribute("user", user);
        return filePath + "result1";
    }

    @RequestMapping(value="/ModelMapTest")
    public String ModelMapTest(ModelMap modelMap){
        System.out.println("ModelMapTest");
        User user = new User();
        // 設置user對象的username屬性
        user.setUsername("RHZ");
        // 將 User對象添加到ModelMap當中
        modelMap.addAttribute("user", user);
        return filePath + "result2";
    }

    /**
     * Date : 2019-01-20
     * Code Example Ch3 - ModelAndView
     */

    @RequestMapping(value="/ModelAndViewTest")
    public ModelAndView ModelAndViewTest(ModelAndView mv){
        System.out.println("ModelAndViewTest");
        User user = new User();
        // 設置user對象的username屬性
        user.setUsername("WebAppX-v1.0.1");
        // 將 User對象添加到ModelAndView當中
        mv.addObject("user", user);
        // 設置轉發頁面
        mv.setViewName(filePath + "result1");
        return mv;
    }
}
