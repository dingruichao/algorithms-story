package com.ding.share.jdk8;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Data
public class OptionalDemo {

    public static void main(String[] args) {
        Student xiaoming=new Student();
        xiaoming.setNo(null);
        xiaoming.setSex(1);

        Grade grade1=new Grade();
        xiaoming.setGrade(grade1);
        grade1.setId(1);
        grade1.setName("高一");
        Course courseEn= new Course("英文",90);
        Course courseshu= new Course("数学",60);
        grade1.getCourseList().add(courseEn);
        grade1.getCourseList().add(courseshu);

         Object a= Optional.ofNullable(xiaoming).map(student1 -> student1.getGrade());



//                map(grade -> grade.getCourseList()).
//                map(courses ->courses.stream().filter(course -> course.getScore()>990) )
//                .get().findFirst().map(cc->cc.getName()).orElse("");

        System.out.println(a);

    }


}

/**
 * 学生
 */
@Data
class Student{
    Integer no; //学号
    Integer sex; //性别 1男 2女
    Grade grade;

}

/**
 * 年级
 */
@Data
class Grade{
    String name;
    int id;
    List<Course> courseList=new ArrayList<>();
}

/**
 * 课程
 */
@Data
class Course{
    public Course(){}
    public Course(String name,int score){
        this.name=name;
        this.score=score;
    }

    String  name;
    int score;
}
