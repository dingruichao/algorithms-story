package com.ding.share.ideadebugshare.service.impl;

import com.ding.share.ideadebugshare.dto.StudentClass;
import com.ding.share.ideadebugshare.service.StudentClassService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentClassServiceimpl implements StudentClassService {
    @Override
    public StudentClass getStudentClassByStudentId(int studentId) {
        StudentClass studentClass=new StudentClass();
        studentClass.setStudentId(studentId);
        studentClass.setClassId(studentId+100);
        return studentClass;
    }

    @Override
    public List<StudentClass> getStudentClassListByClassId(int classId) {
        if(classId==9){
            return null;
        }
        List<StudentClass> studentClassList=new ArrayList<>();
        for(int i=0;i<100;i++){
            StudentClass studentClass=new StudentClass();
            studentClass.setStudentId(i+1);
            studentClass.setClassId(classId);
            studentClassList.add(studentClass);
        }

        return studentClassList;
    }
}
