package com.jacket.demo;

import com.jacket.service.JacketService;
import com.jacket.dao.JacketDAO;

public class JacketDemo {

	
	public JacketDemo () {
	}
	
	
	public static void main(String[] args) {
		JacketService jacketService = new JacketService(new JacketDAO());
		System.out.println("Name of Jacket in Demo: " + jacketService.getJacketName());
	}

}