package com.sain.controller;

import com.sina.api.IBlogApi;
import com.sina.utils.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("blog")
public class BlogController {

    @Autowired
    private IBlogApi blogApi;

    @RequestMapping("/find")
    @ResponseBody
    public JsonObject getBLogs(){

        return  blogApi.getBlogs();
    }
}
