package com.mybatis3.services;


import com.mybatis3.domain.Student;
import com.mybatis3.mappers.StudentMapper;
import com.mybatis3.util.MyBatisSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by wxliutao on 2016/11/29.
 */
public class StudentService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public List<Student> findAllStudnets(){
        List<Student> students = null;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisSessionFactory.getSqlSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            students = studentMapper.findAllStudents();
            logger.debug("Select All Students Successful");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(sqlSession != null){
                //释放sqlSession
                sqlSession.close();
            }
        }
        return  students;
    }

    public Student findStudentById(int id){
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        logger.debug("Select Student By ID :{}",id);
        Student student = null;
        try {
            student = studentMapper.findStudentById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return student;
    }


    public void insertStudent(Student student){
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
        logger.debug("Insert Student ");
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.insertStudent(student);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

}
