package com.wx.demo.builder;

public class ManBuilder implements PersonBuilder {
	
	Person person;
	
	public ManBuilder() {
		person = new Person();
	}

	@Override
	public void buildHead() {
		person.setHead("man-建造头部部分");
	}

	@Override
	public void buildBody() {
		person.setBody("man-建造身体部分");
	}

	@Override
	public void buildFoot() {
		person.setFoot("man-建造四肢部分");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
