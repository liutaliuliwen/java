package com.mybatis3.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * mybatis 工具类
 * Created by wxliutao on 2016/11/29.
 */
public class MyBatisSessionFactory {
    private static SqlSessionFactory sqlSessionFactory;
    //获取sql工厂
    public static SqlSessionFactory getSqlSessionFactory() {
        if(sqlSessionFactory == null){
            String resource = "mybatis-config.xml";
            InputStream inputStream = null;
            try {
                inputStream = Resources.getResourceAsStream(resource);
            } catch (IOException e) {
                e.printStackTrace();
            }
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory;
    }

    //获取sqlSession
    public static SqlSession getSqlSession()  {
        return getSqlSessionFactory().openSession();
    }

}
