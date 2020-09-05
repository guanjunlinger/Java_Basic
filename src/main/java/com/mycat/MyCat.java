package com.mycat;

import org.apache.ibatis.builder.xml.XMLConfigBuilder;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

public class MyCat {

public static SqlSession getSqlSession(){
    XMLConfigBuilder xmlConfigBuilder =new XMLConfigBuilder(MyCat.class.getResourceAsStream("mybatis-config.xml"));
    Configuration configuration =xmlConfigBuilder.parse();
    SqlSessionFactory sqlSessionFactory =new DefaultSqlSessionFactory(configuration);
    return sqlSessionFactory.openSession(true);
}

    public static void main(String[] args) {
           SqlSession sqlSession =getSqlSession();
           StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
           System.out.println(studentMapper.getStudentById(1));
}

}
