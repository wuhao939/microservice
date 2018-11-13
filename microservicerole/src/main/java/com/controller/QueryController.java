package com.controller;

import com.dao.StuDao;
import com.poj.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class QueryController {
    @Autowired
    private StuDao stuDao;
    @RequestMapping(value = "/student_info")
    public Map<String,Object> query_stu_info_and_grade(String name){
        Student student = stuDao.findByName(name);
        Map<String,Object> res = new HashMap<String, Object>();
        res.put("student_info",student);
        return res;
    }
}
