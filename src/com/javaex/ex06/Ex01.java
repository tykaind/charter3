package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

		Integer i = new Integer(10);
		Integer ii = new Integer(7);
		
		Integer result = i + ii;
		
		//Integer result = new Integer(10) + new Integer(10);
		
		System.out.println(result);
		
		int i10 = 7;
		Integer i11 = 10;	// Integer i11 = new Integer(10);
		
		
		Integer i100 = 15;
		int i101 = i100;
		System.out.println(i101);
		
		int i99 = new Integer(6);
		
		System.out.println("===== 문자열-> 정수 =====");
		
		Integer i999 = new Integer(999);
		int num = i999.parseInt("12345");
		System.out.println(num);
		//12345 -> 12345 실제사용
		int num2 = Integer.parseInt("12345");
		System.out.println(num2);
		
		
		//정수 -> 문자열로 예제서용
		String str = new String("hi");
		String strResult = str.valueOf(123456);
		System.out.println(strResult);
		
		//정수 -> 문자열로 실제사용
		String str2 = String.valueOf(1234567);
		System.out.println(str2);
		
		//정수 -> 문자열로 많이사용
		String strResult3 = ""+str2;
		System.out.println(strResult3);
		
		String yn = "y";
		//String yn = new String("y")
		
		
		//null 상황을 yn이 값이없을때 못피한다.
		if(yn.equals("y")) {
			System.out.println("게임다시시작");
		}
		
		//equals 사용팁 -> null 상황을 피한다.
		if("y".equals(yn)) {
			System.out.println("게임다시시작");
			
		Short s = new Short((short) 3);
		Byte bt = new Byte((byte) 1);
			
			
		}
	}

}
