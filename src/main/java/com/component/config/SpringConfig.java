package com.component.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.component.dao.UserManagementDao;
import com.component.dao.UserManagementDaoImpl;
import com.service.StudentService;
import com.service.StudentServiceImpl;

@Configuration
@ComponentScan("com.component")
public class SpringConfig {
	@Bean
	public StudentService studentService() {
		return new StudentServiceImpl();
	}
	@Bean
	public UserManagementDao userManagementDao(){
		return new UserManagementDaoImpl();
	}
}
