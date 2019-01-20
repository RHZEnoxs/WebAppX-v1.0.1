package spring.mvc.code.ch3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Code Example : Ch2 - AnnotationTest
 * Code Example : Ch3 - ControllerTest
 */
@Controller
public class HelloController {
    /**
     * Date : 2019-01-20
     * Code Example Ch2 - AnnotationTest
     */
    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        System.out.println("hello方法 被調用");
        // 創建準備返回的ModelAndView對象，該對象通常包含了返回視圖的路徑、模型的名稱以及模型對象
        ModelAndView mv = new ModelAndView();
        //添加模型數據 可以是任意的POJO對象
        mv.addObject("message", "Hello World!!!!!");
        // 設置邏輯視圖名，視圖解析器會根據該名字解析到具體的視圖頁面
        mv.setViewName("/WEB-INF/jsp/welcome.jsp"); // Ch2
        mv.setViewName("welcome");
        // 返回ModelAndView對象。
        return mv;
    }

    /**
     * Date : 2019-01-20
     * Code Example Ch3 - ControllerTest
     */
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }
}
