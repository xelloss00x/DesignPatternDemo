package com.wx.demo.singleton.staticinnerclass;

public class Singleton {
	private Singleton() {}
	
	private static class SingletonHolder{
		private final static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}

}
