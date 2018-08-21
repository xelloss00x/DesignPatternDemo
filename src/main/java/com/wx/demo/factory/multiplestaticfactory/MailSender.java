package com.wx.demo.factory.multiplestaticfactory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is mail sender!");
	}

}
