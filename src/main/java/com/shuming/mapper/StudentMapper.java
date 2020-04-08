package com.shuming.mapper;

import com.shuming.domain.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    Student get(@Param("id") int id);
}
