package com.mybatis3.mappers;

import com.mybatis3.domain.Student;

import java.util.List;

/**
 * Created by wxliutao on 2016/11/29.
 */
public interface StudentMapper {
    public List<Student> findAllStudents();
    public Student findStudentById(int id);
    public void insertStudent(Student student);

}
