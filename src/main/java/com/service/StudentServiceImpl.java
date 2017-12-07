package com.service;

import java.util.HashMap;
import java.util.Map;

public class StudentServiceImpl implements StudentService {

	Map<Integer, String> map = new HashMap<Integer, String>();
	
	{
		map.put(1, "Ashik");
		map.put(2, "Ibraim Khan");
		map.put(3, "Muhammad Ashik Ali Khan");
	}
	@Override
	public String getStudent(Integer id) {
		return map.get(id);
	}

}
