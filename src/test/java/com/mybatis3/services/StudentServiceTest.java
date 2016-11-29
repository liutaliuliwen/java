package com.mybatis3.services;

import com.mybatis3.domain.Student;
import com.mybatis3.util.MyBatisSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by wxliutao on 2016/11/29.
 */
public class StudentServiceTest {
    private StudentService studentService;
    @Before
    public void setUp() throws Exception {
        studentService = new StudentService();
    }

    @After
    public void tearDown() throws Exception {
        studentService = null;
    }

    @Test
    public void findAllStudnets() throws Exception {
        List<Student> students = studentService.findAllStudnets();
        Assert.assertNotNull(students);
        System.out.println(students);
    }

    @Test
    public void findStudentById() throws Exception {
        Student student = studentService.findStudentById(1);
        Assert.assertNotNull(student);
        System.out.println(student);
    }

    @Test
    public void insertStudent() throws Exception {
        Student student = new Student();
        student.setName("Liutao");
        student.setEmail("271297773@qq.com");
        student.setDob(new Date());
        studentService.insertStudent(student);
    }

}