package spring.mvc.code.ch12.service;

import spring.mvc.code.ch12.domain.User;

/**
 * User服務層接口
 * */
public interface UserService {

	/**
	 * 判斷用戶登錄
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User對象，沒有找到返回null
	 * */
	User login(String loginname, String password);

}
