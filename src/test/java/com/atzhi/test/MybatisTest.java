package com.atzhi.test;

import com.atzhi.domain.Course;
import com.atzhi.domain.School;
import com.atzhi.mapper.CourseMapper;
import com.atzhi.mapper.SchoolMapper;
import com.atzhi.tools.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {

    //查询 id=2 的课程信息
    @Test
    public void test1(){
        SqlSession session = MyBatisUtils.getSession();
        CourseMapper courseMapper = session.getMapper(CourseMapper.class);
        Course course = courseMapper.findByCourseid(2);
        System.out.println(course);
        session.close();
    }

    //查询出所有计算机学院开设的课程信息
    @Test
    public void test2(){
        SqlSession session = MyBatisUtils.getSession();
        CourseMapper courseMapper = session.getMapper(CourseMapper.class);
        List<Course> courses = courseMapper.findBySchoolid(1);
        for (Course course:courses) {
            System.out.println(course);
        }
        session.close();
    }

    //将 id=4 这⻔课程的课时数修改为 32+8=40；
    @Test
    public void test3(){
        SqlSession session = MyBatisUtils.getSession();
        CourseMapper courseMapper = session.getMapper(CourseMapper.class);
        int result=courseMapper.updateHoursById(4);
        if(result>0){
            System.out.println("成功更新"+result+"条数据");
        }else{
            System.out.println("更新数据失败");
        }
        session.commit();
        session.close();
    }

    //插⼊⼀条新的课程记录： name=”⼤数据存储“，hours=32，schools =1；
    @Test
    public void test4(){
        SqlSession session = MyBatisUtils.getSession();
        CourseMapper courseMapper = session.getMapper(CourseMapper.class);
        Course course=new Course(5,"”⼤数据存储",32);

        int result=courseMapper.insertCourse(course);
        if(result>0){
            System.out.println("成功插入"+result+"条数据");
        }else{
            System.out.println("插入数据失败");
        }
        session.commit();
        session.close();
    }

    // 输出所有的学院开设的课程信息。
    @Test
    public void test5(){
        SqlSession session = MyBatisUtils.getSession();
        CourseMapper courseMapper = session.getMapper(CourseMapper.class);

        List<Course> courses = courseMapper.findAll();
        for (Course course:courses) {
            System.out.println(course);
        }
        session.close();
    }

    @Test
    public void testAll(){
        test1();
        test2();
        test3();
        test4();
        test5();
    }

}
