package com.register.ejb.beans.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.register.jpa.entity.ApplicationUser;

@Local
public interface UserBeanLocal {
	public ApplicationUser updateUser(ApplicationUser user);
	public ApplicationUser getUser(int id);
	public List<ApplicationUser> getUserList();

}
