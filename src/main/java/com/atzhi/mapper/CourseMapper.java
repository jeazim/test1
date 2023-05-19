package com.atzhi.mapper;

import com.atzhi.domain.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CourseMapper {
    @Select("select * from s_course c,s_school s where c.id=#{id} and c.sid=s.id")
    @Results({
            @Result(column = "sid",property = "school.id"),
            @Result(column = "school_name",property = "school.school_name")
    })
    public Course findByCourseid(int id);
    @Select("select id,course_name,hours from s_course where sid=#{id}")
    public List<Course> findBySchoolid(int id);

    @Update("update s_course set hours = 40 where id=#{id}")
    public int updateHoursById(int id);

    @Insert("insert into s_course value(#{id},#{course_name},#{hours},1)")
    int insertCourse(Course course);

    @Select("select id,course_name,hours from s_course")
    List<Course> findAll();
}
