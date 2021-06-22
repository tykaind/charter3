package com.javaex.ex04;

import com.javaex.ex01.Point;

public class Rectangle {
		//필드
		private int width;
		private int height;
		private Rectangle obj;
		
		//생성자
		public Rectangle(int width, int height) {
			super();
			this.obj = obj;
			this.width = width;
			this.height = height;
		}

		Rectangle p = ((Rectangle)obj);
		
		public boolean equals(Object obj) {
			if(this.width==p.width && this.height == p.height) {
				return true;
			}else {
				return false;
			}
		}
		
}
