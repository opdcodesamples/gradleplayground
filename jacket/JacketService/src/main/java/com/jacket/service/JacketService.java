package com.jacket.service;

import com.jacket.dao.JacketDAO;

public class JacketService {

	private JacketDAO jacketDao;
	
	public JacketService () {
	}
	
	public JacketService (JacketDAO jacketDao) {
		this.jacketDao = jacketDao;
	}
	
	public String getJacketName() {
		return jacketDao.getJacketName();
	}
	
	
	public static void main(String[] args) {
		System.out.println("Hello, world: " + " in JacketService");
	}

}