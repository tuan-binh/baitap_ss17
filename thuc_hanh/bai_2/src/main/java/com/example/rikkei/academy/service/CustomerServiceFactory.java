package com.example.rikkei.academy.service;

import com.example.rikkei.academy.service.impl.SimpleCustomerServiceImpl;

public class CustomerServiceFactory {
	private static CustomerService singleton;
	
	public static synchronized CustomerService getInstance() {
		if (singleton == null) {
			singleton = new SimpleCustomerServiceImpl();
		}
		return singleton;
	}
	
}
