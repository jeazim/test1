package com.atzhi.domain;

import com.atzhi.mapper.SchoolMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public class School  {
    private int id;
    private String school_name;
    private List<Course> courses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", school_name='" + school_name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
