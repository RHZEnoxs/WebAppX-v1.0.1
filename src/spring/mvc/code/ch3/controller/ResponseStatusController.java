package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.code.ch3.exception.ResponseStatusException;

@Controller
@RequestMapping("responseStatus")
public class ResponseStatusController {
    @GetMapping("/find")
    public String find() throws Exception{
        try {
            int i = 5/0;
            return "success";
        } catch (Exception e) {
            throw new ResponseStatusException();
        }


    }
}
