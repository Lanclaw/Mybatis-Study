package com.lanclaw.dao;

import com.lanclaw.pojo.Blog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBlog(Blog blog);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBLog(Map map);

    List<Blog> queryBlogForeach(Map map);
}
