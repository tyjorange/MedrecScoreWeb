package data.dao.pojo;

import java.util.Date;

public class Hospital {
    private String code;

    private String name;

    private String grade;

    private String level;

    private Date glYear;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Date getGlYear() {
        return glYear;
    }

    public void setGlYear(Date glYear) {
        this.glYear = glYear;
    }
}