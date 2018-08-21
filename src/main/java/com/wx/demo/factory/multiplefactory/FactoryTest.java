package com.wx.demo.factory.multiplefactory;

public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.prodeceMail();
		sender.send();
	}
}
