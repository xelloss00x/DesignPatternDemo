package com.wx.demo.factory.factorymethod;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is mailsender!");
	}

}
