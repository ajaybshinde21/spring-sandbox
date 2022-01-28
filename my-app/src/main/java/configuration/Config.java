package configuration;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.*;
@Component
public class Config {
  @Bean(name="dataSource")
  public DriverManagerDataSource getDataSourceX(){
   DriverManagerDataSource dataSource = new DriverManagerDataSource();
dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
dataSource.setUrl("jdbc:mysql://localhost:3306/JdbcTemplateDb?createDatabaseIfNotExist=true");
dataSource.setUsername("root");
dataSource.setPassword("test");
    return dataSource;
} 

}
