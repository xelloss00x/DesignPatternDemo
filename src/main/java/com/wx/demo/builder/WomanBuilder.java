package com.wx.demo.builder;

public class WomanBuilder implements PersonBuilder {
	
	Person person;

	public WomanBuilder() {
		person = new Person();
	}

	@Override
	public void buildHead() {
		person.setHead("woman-建造头部部分");
	}

	@Override
	public void buildBody() {
		person.setBody("woman-建造身体部分");
	}

	@Override
	public void buildFoot() {
		person.setFoot("woman-建造四肢部分");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
