package com.ding.share.ideadebugshare.ctl;

import com.ding.share.ideadebugshare.dto.ClassInfo;
import com.ding.share.ideadebugshare.dto.Student;
import com.ding.share.ideadebugshare.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 断点回退，
 */

@RestController
public class IdeaDebugDropFrameCtl {
    @Autowired
    StudentService studentService;

    @RequestMapping("/getStudentClassInfo")
    public String getStudentClassInfo(@RequestParam int studentId) {
        ClassInfo classInfo=studentService.getClassInfoByStudentId(studentId);
        return classInfo.toString();
    }
}
