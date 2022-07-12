package com.sapient.endur.creational;

public class EmailNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Sending email notification");		
	}

}

