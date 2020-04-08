package com.shuming;


import com.shuming.domain.Student;
import com.shuming.service.StudentInfoHandler;

public class Main {
    public static void main(String[] args) {
        StudentInfoHandler studentInfoHandler =
                         new StudentInfoHandler();
        Student student = studentInfoHandler.getOne(1);
        System.out.println(student);
    }
}
