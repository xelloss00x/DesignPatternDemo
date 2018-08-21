package com.wx.demo.builder;

public class Test {

	public static void main(String[] args) {
		PersonDirector pb = new PersonDirector();
		Person man = pb.constructPerson(new ManBuilder());
		System.out.println(man.getBody());
		System.out.println(man.getFoot());
		System.out.println(man.getHead());
		Person woman = pb.constructPerson(new WomanBuilder());
		System.out.println(woman.getBody());
		System.out.println(woman.getFoot());
		System.out.println(woman.getHead());
	}

}
