package com.component.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.StudentService;

@ManagedBean(name="studentBean")
@RequestScoped
@Component
public class StudentBean {
	@Autowired
	public StudentService studentService;
	
	private String name;
	private Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String showResult(){
		name = studentService.getStudent(id);
		return "result";
	}

}
