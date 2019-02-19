package spring.mvc.code.ch12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Description:
 * <br>網站：<a href="http://www.fkit.org">瘋狂Java</a>
 * @author 肖文吉	36750064@qq.com
 * @version V1.0
 */

/**
 * 頁面跳轉控制器
 * */
@Controller
public class FormController{

	@RequestMapping(value="/loginForm")
	public String loginForm(){
		// 跳轉頁面
		return "loginForm";
	}

}

