package app.marks.com.ir.dto;

/**
 * Created by vishwanathm on 2/22/2018.
 */

public class Mark extends BaseDto {

    public static final Long serialVersionUID = 211312313123131134L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMakrsObtained() {
        return makrsObtained;
    }

    public void setMakrsObtained(Integer makrsObtained) {
        this.makrsObtained = makrsObtained;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Academic getAcademic() {
        return academic;
    }

    public void setAcademic(Academic academic) {
        this.academic = academic;
    }

    private String id;
    private Integer makrsObtained;
    private Subject subject;
    private Academic academic;

}
