package com.wx.demo.adapter.forobject;

public class Wrapper implements Targetable {
	
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method2() {
		System.out.println("this is targetable method!");
	}

	@Override
	public void method1() {
		source.method1();
	}

}
