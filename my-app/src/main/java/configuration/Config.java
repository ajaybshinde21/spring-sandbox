package configuration;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.*;

@Component
@ComponentScan({ "databaseClient", "entities" })
public class Config {
  @Bean(name = "dataSource")
  public DriverManagerDataSource getDataSourceX() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/JdbcTemplateDb?createDatabaseIfNotExist=true");
    dataSource.setUsername("root");
    dataSource.setPassword("test");
    return dataSource;
  }

  @Bean(name = "jdbcTemplate")
  @Autowired
  public JdbcTemplate jdbcTemplate(DriverManagerDataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }
}
