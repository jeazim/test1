package com.atzhi.domain;

import com.atzhi.mapper.CourseMapper;

public class Course {
    private int id;
    private String course_name;
    private int hours;
    private School school;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Course(int id, String course_name, int hours) {
        this.id = id;
        this.course_name = course_name;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course_name='" + course_name + '\'' +
                ", hours=" + hours +
                ", school=" + school +
                '}';
    }
}
