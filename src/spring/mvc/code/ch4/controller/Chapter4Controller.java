package spring.mvc.code.ch4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({ "/chapter4" })
public class Chapter4Controller {
    @RequestMapping(value = { "" }, method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("chapter4");
        return view;
    }
}
