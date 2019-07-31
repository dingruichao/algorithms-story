package com.ding.share.ideadebugshare.ctl;

import com.ding.share.ideadebugshare.dto.ClassInfo;
import com.ding.share.ideadebugshare.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 中断返回
 */

@RestController
public class IdeaDebugForceReturnCtl {
    @Autowired
    StudentService studentService;

    @RequestMapping("/retTest")
    public String retTest(@RequestParam int studentId) {
        ClassInfo classInfo=studentService.getClassInfoByStudentId(studentId);
        return classInfo.toString();
    }
}
