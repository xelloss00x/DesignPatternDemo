package com.wx.demo.factory.multiplestaticfactory;

public class SendFactory {

	public static Sender prodeceMail() {
		return new MailSender();
	}
	
	public static Sender produceSms() {
		return new SmsSender();
	}
}
