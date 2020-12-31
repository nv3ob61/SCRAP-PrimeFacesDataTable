/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monmo.org.scrap.entities;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author nv3ob61
 */
public class User implements Serializable {

  private static final long serialVersionUID = -28484842713693991L;

  private String id;
  private char [] password;
  private String salt;
  
  /**
   * Creates a new instance of User
   */
  public User() {
  }

  public User(String id, char[] password, String salt) {
    this.id = id;
    this.password = password;
    this.salt = salt;
  }

  public String getId() {
    return id;
  }

  public char[] getPassword() {
    return password;
  }

  public String getSalt() {
    return salt;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPassword(char[] password) {
    this.password = password;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }
  
  public String passToString(char [] password){
    return Arrays.toString(password);
  }
}
