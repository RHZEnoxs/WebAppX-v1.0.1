package spring.mvc.code.ch12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 頁面跳轉控制器
 * */
@Controller
@RequestMapping({ "/chapter12" })
public class Ch12_FormController {

	@RequestMapping(value="/loginForm")
	public String loginForm(){
		// 跳轉頁面
		return "code_ch12/loginForm";
	}

}

