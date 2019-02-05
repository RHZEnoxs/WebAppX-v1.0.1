package spring.mvc.code.ch3.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @RestController註解本身使用@ControllerAdvicer和@ResponseBody註解。
 * 使用了@RestControllerAdvice註解的類會被看作一個ControllerAdvicer，
 * 而該類中所有使用@ExceptionHandler註解的方法都默認使用了的@ResponseBody註解。
 * */
//ControllerAdvice
//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 處理Exception類型異常，ControllerAdvice
    /*@ExceptionHandler(value = Exception.class)
    public ModelAndView globalErrorHandler(Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("ex", e);
        mav.setViewName("error");
        return mav;
    }*/

    // 處理OrderException自定義異常
    @ExceptionHandler(value = OrderException.class)
    // @ResponseBody，ControllerAdvice
    public Object OrderErrorHandler(Exception e) throws Exception {
        // 創建返回對象Map並設置屬性，會被@ResponseBody註解轉換為JSON返回
        Map<String, Object> map = new HashMap<>();
        map.put("code", 100);
        map.put("message", e.getMessage());
        map.put("data", "請求失敗");
        return map;
    }
}
