package spring.mvc.code.ch12.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import spring.mvc.code.ch12.domain.Book;

/**
 * BookMapper接口
 * */
public interface BookMapper {

	/**
	 * 查詢所有圖書
	 * @return 圖書對像集合
	 * */
	@Select(" select * from tb_ch12_book ")
	List<Book> findAll();

}
