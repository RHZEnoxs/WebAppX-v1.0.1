package spring.mvc.code.ch3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.mvc.code.ch3.domain.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * @RestController註解使用@Controller和@ResponseBody註解。
 * 使用了@RestController註解的類會被看作一個controller，
 * 使用@RequestMapping的方法有一個默認的@ResponseBody註解。
 */
@RestController
@RequestMapping("/rest")
public class RestTaskController {

    @RequestMapping(value="/tasktRequestBody")
    public Object getJson() {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1,"Spring MVC + MyBatis #1","Enoxs"));
        list.add(new Book(2,"Spring MVC + MyBatis #2","RHZ"));
        return list;
    }
}
