package com.mycompany.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import databaseClient.JdbcClient;
import entities.User;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(configuration.Config.class);
        JdbcClient jdbcClient = atx.getBean(JdbcClient.class);
        User u = atx.getBean(User.class);
        u.setId(103);
        u.setName("Jane Doe");
        u.setPassword("whocares");
        u.setUsername("jane");
        jdbcClient.insertUser(u);
    }
}
