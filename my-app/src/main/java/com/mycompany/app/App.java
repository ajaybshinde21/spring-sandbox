package com.mycompany.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import databaseClient.JdbcClient;
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
    }
}
