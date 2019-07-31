package com.ding.share.ideadebugshare.service;

import com.ding.share.ideadebugshare.dto.StudentClass;

import java.util.List;

public interface StudentClassService {
     StudentClass getStudentClassByStudentId(int studentId);
     List<StudentClass> getStudentClassListByClassId(int classId);

}
