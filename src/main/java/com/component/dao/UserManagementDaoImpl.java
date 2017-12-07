package com.component.dao;

import java.util.HashMap;
import java.util.Map;

public class UserManagementDaoImpl implements UserManagementDao {

	private Map<Integer, String> map = new HashMap<Integer, String>();
	
	{
		map.put(1, "USER1");
		map.put(2, "USER2");
		map.put(3, "USER3");
	}
	
	@Override
	public String getUser(Integer id) {
		return map.get(id);
	}

}
