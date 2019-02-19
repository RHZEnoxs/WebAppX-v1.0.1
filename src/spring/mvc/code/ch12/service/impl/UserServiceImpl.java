package spring.mvc.code.ch12.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import spring.mvc.code.ch12.domain.User;
import spring.mvc.code.ch12.mapper.UserMapper;
import spring.mvc.code.ch12.service.UserService;

/**
 * User服務層接口實現類
 * @Service("userService")用於將當前類註釋為一個Spring的bean，名為userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {

	/**
	 * 自動注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;

	/**
	 * UserService接口login方法實現
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(String loginname, String password) {
		return userMapper.findWithLoginnameAndPassword(loginname, password);
	}

}
