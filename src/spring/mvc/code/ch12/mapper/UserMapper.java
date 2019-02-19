package spring.mvc.code.ch12.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import spring.mvc.code.ch12.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {

	/**
	 * 根據登錄名和密碼查詢用戶
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User對象，沒有找到返回null
	 * */
	@Select("select * from tb_ch12_user where loginname = #{loginname} and password = #{password}")
	User findWithLoginnameAndPassword(@Param("loginname")String loginname,
									  @Param("password") String password);

}
