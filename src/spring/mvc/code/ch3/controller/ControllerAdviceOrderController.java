package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controllerAdviceOrder")
public class ControllerAdviceOrderController {

    @PostMapping("/search")
    public String search() throws Exception{
        try {
            int i = 5/0;
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            throw new OrderException("訂單查詢失敗!");
        }

    }

}
