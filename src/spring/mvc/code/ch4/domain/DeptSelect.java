package spring.mvc.code.ch4.domain;

import java.io.Serializable;

public class DeptSelect implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;


    public DeptSelect() {
        super();
        // TODO Auto-generated constructor stub
    }


    public DeptSelect(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
