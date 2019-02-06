package spring.mvc.code.ch4.domain;

import java.io.Serializable;
import java.util.List;

public class EmployeeChks implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<DeptChks> depts;

    public List<DeptChks> getDepts() {
        return depts;
    }

    public void setDepts(List<DeptChks> depts) {
        this.depts = depts;
    }
}
