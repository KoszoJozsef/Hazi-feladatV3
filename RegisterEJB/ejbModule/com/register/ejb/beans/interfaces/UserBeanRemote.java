package com.register.ejb.beans.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.register.jpa.entity.ApplicationUser;

@Remote
public interface UserBeanRemote {
	public ApplicationUser updateUser(ApplicationUser user);
	public ApplicationUser getUser(int id);
	public List<ApplicationUser> getUserList();
}
