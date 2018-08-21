package com.wx.demo.factory.multiplefactory;

public class SendFactory {

	public Sender prodeceMail() {
		return new MailSender();
	}
	
	public Sender produceSms() {
		return new SmsSender();
	}
}
