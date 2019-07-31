package com.ding.share.ideadebugshare.ctl;


import com.ding.share.ideadebugshare.dto.Student;
import com.ding.share.ideadebugshare.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdeaDebugBasicUseController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/hi")
    public String hi(@RequestParam int id) {
        Student student=studentService.getStudentById(id);
        if(StringUtils.isEmpty(student.getName())){
            return "name is null";
        }
        return student.toString();
    }

}