package app.marks.com.ir.dto;

/**
 * Created by vishwanathm on 2/20/2018.
 */

public class Department extends BaseDto {

    public static final Long serialVersionUID = 211312313123131133L;
    private String id;

    private String name;


    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
