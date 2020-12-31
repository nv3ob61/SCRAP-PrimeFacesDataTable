/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monmo.org.scrap.controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import monmo.org.scrap.entities.User;

/**
 *
 * @author nv3ob61
 */
@Named(value = "userController")
@SessionScoped
public class UserController implements Serializable {

  private static final long serialVersionUID = -6586572350613892781L;

  private String id;
  private char[] pass;
  private String salt;

  private final String FIN_CARGA = "FIN DE CARGA User Controller.....";
  
  private List<User> userList;

  /**
   * Creates a new instance of UserController
   */
  public UserController() {
    id = null;
    pass = null;
    salt = null;

    userList = new ArrayList<>();

    User u = new User("paco", "paco".toCharArray(), "417");
    User u2 = new User("pepe", "pepe".toCharArray(), "417");
    User u3 = new User("juan", "juan".toCharArray(), "417");
    User u4 = new User("jose", "jose".toCharArray(), "417");
    User u5 = new User("abel", "abel".toCharArray(), "417");
    User u6 = new User("punk", "punk".toCharArray(), "417");
    User u7 = new User("funk", "funk".toCharArray(), "417");
    User u8 = new User("rock", "rock".toCharArray(), "417");

    userList.add(u);
    userList.add(u2);
    userList.add(u3);
    userList.add(u4);
    userList.add(u5);
    userList.add(u6);
    userList.add(u7);
    userList.add(u8);
    
    System.out.println(FIN_CARGA);
  }

  public String getId() {
    return id;
  }

  public char[] getPass() {
    return pass;
  }

  public String getSalt() {
    return salt;
  }

  public List<User> getUserList() {
    return userList;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPass(char[] pass) {
    this.pass = pass;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public void setUserList(List<User> userList) {
    this.userList = userList;
  }

}
