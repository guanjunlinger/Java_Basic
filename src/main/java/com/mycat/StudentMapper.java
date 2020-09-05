package com.mycat;

import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    Student getStudentById(@Param("id") Integer id);

    Student getStudentByName(@Param("name") String id);

}
