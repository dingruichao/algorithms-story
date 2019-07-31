package com.ding.share.ideadebugshare.service.impl;

import com.ding.share.ideadebugshare.dto.ClassInfo;
import com.ding.share.ideadebugshare.service.ClassInfoService;
import org.springframework.stereotype.Service;

@Service
public class ClassInfoServiceImpl implements ClassInfoService {
    @Override
    public ClassInfo getClassInfoById(int id) {
        ClassInfo classInfo=new ClassInfo();
        classInfo.setId(id);
        classInfo.setName("高三"+id+"班");
        classInfo.setNo("G3_"+id);
        return classInfo;
    }
}
