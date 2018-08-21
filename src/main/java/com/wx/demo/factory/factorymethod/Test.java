package com.wx.demo.factory.factorymethod;

public class Test {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
	}

}
