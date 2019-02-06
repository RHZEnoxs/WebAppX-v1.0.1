package spring.mvc.code.ch4.domain;

import java.io.Serializable;

public class UserSelect implements Serializable {

    private static final long serialVersionUID = 1L;

    // 部門編號
    private Integer deptId;

    public UserSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }


}
