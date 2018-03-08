package app.marks.com.ir.dto;

/**
 * Created by vishwanathm on 2/19/2018.
 */

public class Subject  extends BaseDto{

    public static final Long serialVersionUID = 211312313123131136L;
    private String name;

    private String id;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private Department department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
