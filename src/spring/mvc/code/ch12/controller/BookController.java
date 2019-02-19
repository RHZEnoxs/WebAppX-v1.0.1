package spring.mvc.code.ch12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.code.ch12.domain.Book;
import spring.mvc.code.ch12.service.BookService;

import java.util.List;

/**
 * 處理圖書請求控制器
 * */
@Controller
public class BookController {

	/**
	 * 自動注入BookService
	 * */
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;

	/**
	 * 處理/main請求
	 * */
	@RequestMapping(value="/main")
	public String main(Model model){
		// 獲得所有圖書集合
		List<Book> book_list = bookService.getAll();
		// 將圖書集合添加到model當中
		model.addAttribute("book_list", book_list);
		// 跳轉到main頁面
		return "main";
	}

}
