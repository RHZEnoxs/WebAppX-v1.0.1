package spring.mvc.code.ch4.domain;

import java.io.Serializable;
// 域對象，實現序列化接口
public class UserRadio implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
