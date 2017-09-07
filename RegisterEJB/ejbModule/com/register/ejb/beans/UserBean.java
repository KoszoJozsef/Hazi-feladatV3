package com.register.ejb.beans;

import java.util.List;

import com.register.ejb.beans.interfaces.UserBeanLocal;
import com.register.ejb.beans.interfaces.UserBeanRemote;
import com.register.jpa.entity.ApplicationUser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class UserBean
 */
@Stateless
public class UserBean implements UserBeanRemote, UserBeanLocal {

	@PersistenceContext
	EntityManager em;
	
    /**
     * Default constructor. 
     */
    public UserBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public ApplicationUser updateUser(ApplicationUser user) {
		em.merge(user);
		return user;
	}

	@Override
	public ApplicationUser getUser(int id) {
		ApplicationUser user = em.find(ApplicationUser.class, id);
		return user;
	}

	@Override
	public List<ApplicationUser> getUserList() {
		return em.createNamedQuery("ApplicationUser.findById", ApplicationUser.class).getResultList();

	}

}
