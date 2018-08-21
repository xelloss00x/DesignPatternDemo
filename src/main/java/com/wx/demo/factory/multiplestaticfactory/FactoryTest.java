package com.wx.demo.factory.multiplestaticfactory;

public class FactoryTest {

	public static void main(String[] args) {
		Sender sender = SendFactory.prodeceMail();
		sender.send();
	}
}
