package com.synacy.exercise;

public class EmailMessenger implements Messenger {

	@Override
	public void sendMessage(String message, Contact contact) {
		System.out.printf("Sending %s to %s from %s via email\n", message, contact.getEmailAddress(), contact.getName());
	}

}
