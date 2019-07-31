package com.ding.share.ideadebugshare.service.impl;

import com.ding.share.ideadebugshare.dto.ClassInfo;
import com.ding.share.ideadebugshare.dto.Student;
import com.ding.share.ideadebugshare.dto.StudentClass;
import com.ding.share.ideadebugshare.service.ClassInfoService;
import com.ding.share.ideadebugshare.service.StudentClassService;
import com.ding.share.ideadebugshare.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentClassService studentClassService;
    @Autowired
    ClassInfoService classInfoService;
    @Override
    public Student getStudentById(int id) {
        Student student=new Student();
        student.setAge(18);
        student.setName("小明"+id);
        student.setId(id);
        return student;
    }

    @Override
    public ClassInfo getClassInfoByStudentId(int id) {
        StudentClass studentClass=studentClassService.getStudentClassByStudentId(id);
        //运行到光标 智能进入
        ClassInfo classInfo=classInfoService.getClassInfoById(studentClass.getClassId());
        return classInfo;
    }

    @Override
    public List<Student> getListByClassId(int classId) {
        List<StudentClass> studentClassList=studentClassService.getStudentClassListByClassId(classId);
        List<Student> resList=new ArrayList<>();
        for(StudentClass studentClass:studentClassList){
            Student student= getStudentById(studentClass.getStudentId());

            resList.add(student);
        }
        return resList;
    }


}
