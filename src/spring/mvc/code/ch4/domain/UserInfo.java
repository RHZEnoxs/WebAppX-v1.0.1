package spring.mvc.code.ch4.domain;

import java.io.Serializable;

// 域對象，實現序列化接口
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    // 私有字段
    private String username;
    private String sex;
    private Integer age;

    public UserInfo() {
        super();
    }

    public UserInfo(String username, String sex, Integer age) {
        super();
        this.username = username;
        this.sex = sex;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "UserInfo [username=" + username + ", sex=" + sex + ", age=" + age
                + "]";
    }


}
