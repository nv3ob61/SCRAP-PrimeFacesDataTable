/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monmo.org.scrap.DAO;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import monmo.org.scrap.entities.User;

/**
 *
 * @author nv3ob61
 */
@Named(value = "userDaoImpl")
@SessionScoped
public class UserDaoImpl implements UserDao, Serializable {

  private static final long serialVersionUID = 4747770010845932961L;

  /**
   * Creates a new instance of UserDaoImpl
   */
  public UserDaoImpl() {
  }

  @Override
  public User findByName(String val) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void save(User user) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public User findById(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void update(User user) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public User login(User user) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
