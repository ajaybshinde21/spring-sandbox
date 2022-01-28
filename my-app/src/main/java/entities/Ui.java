package entities;

import org.springframework.stereotype.Component;

@Component
public class Ui {
  public void showError(String s){
    System.out.println(s);
  }
}
