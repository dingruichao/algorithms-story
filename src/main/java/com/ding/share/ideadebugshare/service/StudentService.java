package com.ding.share.ideadebugshare.service;

import com.ding.share.ideadebugshare.dto.ClassInfo;
import com.ding.share.ideadebugshare.dto.Student;

import java.util.List;

public interface StudentService {
    public Student getStudentById(int id);
    public ClassInfo getClassInfoByStudentId(int id);

    public List<Student> getListByClassId(int classId);



}
