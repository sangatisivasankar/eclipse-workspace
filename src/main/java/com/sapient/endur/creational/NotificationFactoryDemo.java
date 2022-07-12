package com.sapient.endur.creational;

public class NotificationFactoryDemo {

	public static void main(String[] args) {
		NotificationFactory factory= new NotificationFactory();
		Notification notification1= factory.createNotification(NotificationType.SMS);
		notification1.notifyUser();
		System.out.println("-----------------------------------");
		Notification notification2= factory.createNotification(NotificationType.EMAIL);
		notification2.notifyUser();
		System.out.println("-----------------------------------");
		Notification notification3= factory.createNotification(NotificationType.PUSH);
		notification3.notifyUser();

	}

}
