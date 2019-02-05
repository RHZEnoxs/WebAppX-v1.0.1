package spring.mvc.code.ch4.domain;

import java.io.Serializable;
import java.util.List;

public class UserChk implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean reader;
    private List<String> courses;

    public UserChk() {
        super();
    }


    public boolean isReader() {
        return reader;
    }


    public void setReader(boolean reader) {
        this.reader = reader;
    }


    public List<String> getCourses() {
        return courses;
    }


    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

}
