package com.sapient.endur.creational;

/**
 * 
 * @author Admin
 * This class is based on Factory design pattern, contains a method that
 * returns instance of either SMSNotification or EmailNotification or Push Notification
 * object.
 */
public class NotifcationFactory {
	public Notification createNotification(NotificationType type) {
		switch(type) {
			case SMS:  return new SMSNotification(); 
			case EMAIL: return new EmailNotification(); 
			case PUSH: return new PushNotification();
			default: throw new IllegalArgumentException("Invalid notification type");
		}
	}
}
