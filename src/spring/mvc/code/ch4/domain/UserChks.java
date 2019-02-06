package spring.mvc.code.ch4.domain;

import java.io.Serializable;
import java.util.List;
// 域對象，實現序列化接口

public class UserChks implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<String> courses;

    public UserChks() {
        super();
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
