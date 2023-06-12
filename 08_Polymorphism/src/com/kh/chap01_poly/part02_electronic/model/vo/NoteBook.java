package com.kh.chap01_poly.part02_electronic.model.vo;

public class NoteBook extends Electronic{ 
	
		private int usbPoint;
		
		public NoteBook() {}
		
		public NoteBook(String brand, String name, int price, int usbPoint) {
			super(brand, name, price);
			this.usbPoint = usbPoint;
		}
		
		public int getUsePoint() {
			return usbPoint;
		}
		public void setUsePoint(int usbPoint) {
			this.usbPoint = usbPoint;
		}
		@Override
		public String toString() {
			return super.toString() + ", usbPoint : " + usbPoint ;
		}
}
