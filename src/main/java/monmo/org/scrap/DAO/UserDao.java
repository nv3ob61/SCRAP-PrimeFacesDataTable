/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monmo.org.scrap.DAO;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import monmo.org.scrap.entities.User;

/**
 *
 * @author nv3ob61
 */
@Named(value = "userDao")
@SessionScoped
public interface UserDao {

  public User findByName(String val);

  public void save(User user);

  public User findById(String id);

  public void update(User user);

  public User login(User user);
}
