package com.wx.demo.adapter.forclass;

public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is targetable method!");
	}

}
