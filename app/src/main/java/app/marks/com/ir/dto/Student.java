package app.marks.com.ir.dto;

/**
 * Created by vishwanathm on 3/7/2018.
 */

public class Student extends User {
    public static final Long serialVersionUID = 211312313123131137L;
    private String marks;
    private String academicYear;

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }
}
