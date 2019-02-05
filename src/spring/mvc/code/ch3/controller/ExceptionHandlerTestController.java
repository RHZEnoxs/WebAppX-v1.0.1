package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exceptionHandler")
public class ExceptionHandlerTestController {
    @GetMapping("/test")
    public String test() throws Exception{
        // 模擬異常
        int i = 5/0;
        return "success";
    }

    /**
     * 在異常拋出的時候，Controller會使用@ExceptionHandler註解的方法去處理異常
     * */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView testErrorHandler(Exception e)  {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error");
        mav.addObject("ex", e);
        return mav;
    }

}
