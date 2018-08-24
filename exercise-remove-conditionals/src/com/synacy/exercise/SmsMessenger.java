package com.synacy.exercise;

public class SmsMessenger implements Messenger {

	@Override
	public void sendMessage(String message, Contact contact) {
		System.out.printf("Sending %s to %s from %s via sms\n", message, contact.getPhoneNumber(), contact.getName());
	}

}
