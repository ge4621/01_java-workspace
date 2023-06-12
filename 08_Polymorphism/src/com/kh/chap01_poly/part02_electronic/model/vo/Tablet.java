package com.kh.chap01_poly.part02_electronic.model.vo;

public class Tablet extends Electronic{
	
		private boolean penFlag;
		
		public Tablet() {}
		
		public Tablet(String brand, String name, int price,boolean penFlag) {
			super(brand, name, price);
			this.penFlag = false;
		}
		public boolean isPenFlag() {
			return penFlag;
		}
		public void sePenFlag(boolean penFlag) {
			this.penFlag = false;
		}
		@Override
		public String toString() {
			return super.toString() + ", " + penFlag;
		}
		
		
		
}
