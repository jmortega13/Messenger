package com.synacy.exercise;

public class VoiceMessenger implements Messenger {

	@Override
	public void sendMessage(String message, Contact contact) {
		System.out.printf("Sending %s to %s from %s via call\n", message, contact.getPhoneNumber(), contact.getName());
	}

}
