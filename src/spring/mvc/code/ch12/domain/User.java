package spring.mvc.code.ch12.domain;

import java.io.Serializable;

/**
 * CREATE TABLE tb_user(
 id INT PRIMARY KEY AUTO_INCREMENT,      #id
 loginname VARCHAR(50) UNIQUE,		#登錄名 郵箱
 PASSWORD VARCHAR(18),			#密碼
 username VARCHAR(18),			#用戶名
 phone VARCHAR(18),			#電話
 address VARCHAR(255)			#地址
 );
 * */
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;			// id
	private String loginname;	// 登錄名
	private String password;	// 密碼
	private String username;	// 用戶名
	private String phone;		// 電話
	private String address;		// 地址

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", loginname=" + loginname + ", password="
				+ password + ", username=" + username + ", phone=" + phone
				+ ", address=" + address + "]";
	}


}
