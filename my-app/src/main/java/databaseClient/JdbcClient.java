package databaseClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcClient {
  JdbcTemplate jdbcTemplate;
  @Autowired
 public  JdbcClient(JdbcTemplate jdbcTemplate){
    this.jdbcTemplate = jdbcTemplate;
 }

}
