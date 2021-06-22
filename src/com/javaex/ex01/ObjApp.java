package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {

		Object obj01 = new Object();
		
		System.out.println(obj01.toString());
		System.out.println(obj01.getClass());
		System.out.println(obj01.hashCode());
		System.out.println(obj01.equals(obj01));

		System.out.println("obj.getClass()=====");
		System.out.println(obj01.getClass());
		System.out.println("===================");
		
		System.out.println("obj.hashCode()=====");
		//System.out.println(obj01.hashCode());
		Object o01 = new Object();
		Object o02 = new Object();
		Object o03 = new Object();
		System.out.println(o01.hashCode());
		System.out.println(o02.hashCode());
		System.out.println(o03.hashCode());
		System.out.println("===================");
	}

}
