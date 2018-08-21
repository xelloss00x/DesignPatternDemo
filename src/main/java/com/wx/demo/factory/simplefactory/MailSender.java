package com.wx.demo.factory.simplefactory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is mail sender!");
	}

}
