package spring.mvc.code.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        System.out.println("hello方法 被調用");
        // 創建準備返回的ModelAndView對象，該對象通常包含了返回視圖的路徑、模型的名稱以及模型對象
        ModelAndView mv = new ModelAndView();
        //添加模型數據 可以是任意的POJO對象
        mv.addObject("message", "Hello World!!!!!");
        // 設置邏輯視圖名，視圖解析器會根據該名字解析到具體的視圖頁面
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        // 返回ModelAndView對象。
        return mv;
    }
}
