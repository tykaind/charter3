package com.javaex.ex03;

import com.javaex.ex01.Point;

public class Rectangle {
		//필드
		private int width;
		private int height;
		
		//생성자
		public Rectangle(int width, int height) {
			super();
			this.width = width;
			this.height = height;
		}

		public boolean equals(Object obj) {
			if(this.width == ((Rectangle)obj).width && this.height == ((Rectangle)obj).height) {
				return true;
			}else {
				return false;
			}
		}
		
}
