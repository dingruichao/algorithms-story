package com.ding.share.ideadebugshare.ctl;

import com.ding.share.ideadebugshare.dto.Student;
import com.ding.share.ideadebugshare.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 异常调试
 */

@RestController
public class IdeaDebugBreakExcetionCtl {
    @Autowired
    StudentService studentService;

    @RequestMapping("/getStudentByClassIdNullExcetion")
    public int getStudentByClassIdNullExcetion() {
        List<Student> list=studentService.getListByClassId(9);
        return list.size();
    }
}
