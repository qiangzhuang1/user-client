package com.demo.userClient;

import com.demo.userService.LoginService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        LoginService loginService = (LoginService) classPathXmlApplicationContext.
                getBean("loginService");
        String rs = loginService.login("name", "pwd");
        System.out.println(rs);
        System.in.read();
    }
}
