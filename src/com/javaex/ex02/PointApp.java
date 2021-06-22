package com.javaex.ex02;

import java.awt.Point;

public class PointApp {

	public static void main(String[] args) {

		Point p00 = new Point(2,3);
		Point p01 = new Point(22,333);
		Point p02 = new Point(222,333);
		Point p03 = p00;
		
		System.out.println("=getClass()========");
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println(p03.getClass());
		System.out.println("===================");
		
		System.out.println("=hashCode()========");
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		System.out.println("===================");
		
		
		System.out.println("=toString()========");
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println(p03.toString());
		System.out.println("===================");
		
		System.out.println("=equals()========");
		System.out.println(p00.equals(p00));
		System.out.println(p01.equals(p01));
		System.out.println(p02.equals(p02));
		System.out.println(p03.equals(p03));
		System.out.println("===================");
	}

}
