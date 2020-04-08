package com.shuming.dao;

import com.shuming.domain.Student;
import com.shuming.mapper.StudentMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDaoImpl implements StudentDao {

    @Override
    public Student get(int ids) {
        ApplicationContext applicationContext =
                    new ClassPathXmlApplicationContext("classpath:spring/spring-config.xml");
        StudentMapper studentMapper =
                (StudentMapper) applicationContext.getBean("studentMapper");
        Integer id = new Integer(ids);
        return studentMapper.get(id);
    }
}
