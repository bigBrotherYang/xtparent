package com.sina;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext cx=  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        cx.start();
        System.in.read();
    }
}
