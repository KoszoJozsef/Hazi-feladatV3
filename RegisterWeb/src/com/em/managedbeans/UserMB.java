package com.em.managedbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.register.ejb.beans.interfaces.UserBeanLocal;
import com.register.jpa.entity.ApplicationUser;
import com.register.jpa.entity.Role;


@ViewScoped
@ManagedBean
public class UserMB {
	
	@EJB
	UserBeanLocal userbl;
	
	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private Role role;
	
	public void updateVehicle(){
		ApplicationUser u = new ApplicationUser();
		u.setId(id);
		u.setUsername(username);
		u.setPassword(password);
		u.setFirstname(firstname);
		u.setLastname(lastname);
		u.setRole(role);
		
		userbl.updateUser(u);
	}
	
	public void getUser(int id){
		ApplicationUser u = userbl.getUser(id);
		this.id = u.getId();
		firstname = u.getFirstname();
		lastname = u.getLastname();
		role = u.getRole();

	}
	
	public List<ApplicationUser> getUsers(){
		return userbl.getUserList();
	}

}
