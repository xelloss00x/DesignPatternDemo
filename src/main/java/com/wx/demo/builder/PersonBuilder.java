package com.wx.demo.builder;

public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFoot();
	Person buildPerson();//组装

}
