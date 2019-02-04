package spring.mvc.code.ch3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.mvc.code.ch3.domain.Book;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/responseBody")
public class ResponseBodyController {

    @RequestMapping(value="/taskResponseBody")
    // @ResponseBody会将集合数据转换json格式返回客户端
    @ResponseBody
    public Object taskResponseBody() {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1,"Spring MVC + MyBatis #1","Enoxs"));
        list.add(new Book(2,"Spring MVC + MyBatis #2","RHZ"));
        return list;
    }


    @RequestMapping(value="/taskFastJSON2")
    // @ResponseBody会将集合数据转换json格式返回客户端
    @ResponseBody
    public Object taskFastJSON2() {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1,"Spring MVC + MyBatis #1","Enoxs"));
        list.add(new Book(2,"Spring MVC + MyBatis #2","RHZ"));
        return list;
    }


}
