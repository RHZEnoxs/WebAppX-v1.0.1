package spring.mvc.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({ "/codeThird" })
public class CodeThirdController {
    @RequestMapping(value = { "" }, method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("codeThird");
        return view;
    }

}
