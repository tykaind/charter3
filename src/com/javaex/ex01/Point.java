package com.javaex.ex01;

public class Point {

		private int x;
		private int y;
		
		//***************** 생 성 자 *******************//
		public Point() {}
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		//************** 생 성 자 END ****************//
		
		//***************** G/S *******************//
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		//************** G/S END ****************//
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		@Override
		public boolean equals(Object obj) {
			if(this.x == ((Point)obj).x && this.y == ((Point)obj).x) {
				return true;
			}else {
				return false;
			}
		
		}
}
