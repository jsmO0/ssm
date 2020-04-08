package com.shuming.service;

import com.shuming.dao.StudentDao;
import com.shuming.dao.StudentDaoImpl;
import com.shuming.domain.Student;

public class StudentInfoHandler {
    public Student getOne(int ids){
        StudentDao studentDao = new StudentDaoImpl();
        return studentDao.get(ids);
    }
}
