package com.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import com.component.dao.UserManagementDao;

@ManagedBean(name="userBean")
@RequestScoped
public class UserBean {

	Integer id;
	String name;
	@Inject
	UserManagementDao userManagementDao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUserName() {
		name = userManagementDao.getUser(id);
		return "userName";
	}
	
}
