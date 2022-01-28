package databaseClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import entities.User;
import entities.Ui;
@Component
public class JdbcClient {
  private JdbcTemplate jdbcTemplate;
  private Ui ui;
  @Autowired
 public  JdbcClient(JdbcTemplate jdbcTemplate, Ui ui){
    this.jdbcTemplate = jdbcTemplate;
    this.ui = ui;
    createTable("User");
 }
public void insertUser(User u) {
   try{
      jdbcTemplate.update("INSERT INTO User values(?,?,?,?)",u.getId(),u.getName(),u.getUsername(),u.getPassword());
    }catch(DataAccessException dae){
       ui.showError(dae.getMessage());
       ui.printStackTrace(dae.getStackTrace());
    }
   
		
}
private void createTable(String tableName) {
 try{
   jdbcTemplate.update("CREATE TABLE IF NOT EXISTS User (id INTEGER, name VARCHAR(20), username VARCHAR(20), password VARCHAR(20))");   
 }catch(DataAccessException dae){
    ui.showError(dae.getMessage());
    ui.printStackTrace(dae.getStackTrace());
 }
   
}
}
