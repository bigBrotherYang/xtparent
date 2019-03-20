package com.sina.impl;

import com.sina.api.IBlogApi;
import com.sina.dao.BlogMapper;
import com.sina.pojo.Blog;
import com.sina.utils.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Blogimpl implements IBlogApi {
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public JsonObject getBlogs() {
        JsonObject jsonObject = new JsonObject();
       try {
           Blog blog = blogMapper.selectByPrimaryKey(1);
            jsonObject.setResult(blog);
       }catch (Exception e){
           jsonObject.setErrorCode("500");
           jsonObject.setMsg(e.getMessage());
           e.printStackTrace();
       }
        return jsonObject;
    }
}
