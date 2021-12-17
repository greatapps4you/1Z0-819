package com.abc.myapp;

import abc.myapp.datalayer.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setName("John Smith");
		System.out.println("User saved: " + user.getName());

	}

}
