package app.marks.com.ir.dto;

/**
 * Created by vishwanathm on 2/22/2018.
 */

public class User extends BaseDto {

    public static final Long serialVersionUID = 211312313123131131L;

    private String id;
    private Person person;
    private UserType type;
    private Subject subject;
    private Department department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


}
