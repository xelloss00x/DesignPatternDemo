package com.wx.demo.factory.multiplestaticfactory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is sms sender");
	}

}
