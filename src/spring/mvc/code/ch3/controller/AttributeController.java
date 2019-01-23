package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

/**
 * Code Example : Ch3 - Attribute (屬性)
 * @RequestAttribute 註解 和 @SessionAttribute 註解的使用
 */
@Controller
public class AttributeController {
    private static String filePath = "code_ch3/";
    /**
     * Date : 2019-01-23
     * Code Example Ch3 - Attribute
     */

    @GetMapping(value="/attrbuteTest")
    public ModelAndView attrbuteTest(ModelAndView mv) {
        System.out.println("attributeTest方法被調用...");
        // 客戶端重定向到main請求，會被自定義過濾器攔截
        mv.setViewName("redirect:main");
        return mv;
    }

    /**
     * 該方法映射的請求為/main
     * @RequestAttribute("school")會獲取request作用範圍中名為"school"的屬性的值賦給school變量
     * @SessionAttribute("author")會獲取session作用範圍中名為"author"的屬性的值賦給author變量
     */
    @RequestMapping("/main")
    public String main(
            @RequestAttribute("school") String school,
            @SessionAttribute("author") String author) {
        System.out.println("main方法被調用...");
        // 输出@RequestAttribute获得的school
        System.out.println("school: " + school);
        // 输出@SessionAttribute获得的author
        System.out.println("author: " + author);

        return filePath + "/requestSessionAttributePage";
    }

}
