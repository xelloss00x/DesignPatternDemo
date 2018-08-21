package com.wx.demo.factory.multiplefactory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is sms sender");
	}

}
