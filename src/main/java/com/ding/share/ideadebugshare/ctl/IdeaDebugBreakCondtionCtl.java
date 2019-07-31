package com.ding.share.ideadebugshare.ctl;

import com.ding.share.ideadebugshare.dto.ClassInfo;
import com.ding.share.ideadebugshare.dto.Student;
import com.ding.share.ideadebugshare.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 条件执行
 */

@RestController
public class IdeaDebugBreakCondtionCtl {
    @Autowired
    StudentService studentService;

    @RequestMapping("/getStudentByClassId")
    public int getStudentByClassId(@RequestParam int classId) {
        List<Student> list=studentService.getListByClassId(classId);
        return list.size();
    }
}
