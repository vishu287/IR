package app.marks.com.ir.dto;

/**
 * Created by vishwanathm on 2/22/2018.
 */

public class Academic {
    private String id;
    private Integer startYear;
    private Integer endYear;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }
}
