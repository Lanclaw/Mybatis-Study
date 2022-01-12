package com.lanclaw.dao;

import com.lanclaw.pojo.User;
import com.lanclaw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){

        //1. 获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2. 执行sql
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserById(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);

        User user = userDao.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);

        int res = userDao.addUser(new User(4, "haha", "1223"));
        System.out.println(res);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);

        int res = userDao.updateUser(new User(4, "haha", "456"));
        System.out.println(res);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);

        int res = userDao.deleteUser(4);
        System.out.println(res);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);

        List<User> users = userDao.getUserLike("张");

        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
