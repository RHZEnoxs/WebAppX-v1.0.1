package spring.mvc.code.ch12.service;

import spring.mvc.code.ch12.domain.Book;

import java.util.List;

/**
 * Book服務層接口
 * */
public interface BookService {

	/**
	 * 查找所有圖書
	 * @return Book對像集合
	 * */
	List<Book> getAll();

}
