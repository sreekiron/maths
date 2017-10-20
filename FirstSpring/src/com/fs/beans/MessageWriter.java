package com.fs.beans;

public class MessageWriter {
	private IMessageProducer messageProducer;

	public MessageWriter(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

	public void writeMessage(String message) {
		String cmsg = null;

		cmsg = messageProducer.convert(message);
		System.out.println(cmsg);
	}
}
