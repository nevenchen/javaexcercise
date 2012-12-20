package com.neven.java.basic;


public class T {
	private static class S extends P {
		private String son;
		public S(){}
		public S(String s){
			System.out.println(super.returnS());
			System.out.println(this.returnS());
			this.son = s;
			System.out.println(super.returnS());
			System.out.println(this.returnS());
		}
		// 这里没有重写父类的方法，因为父类方法不可�?
		void prt() {
			System.out.println("Son.prt");
		}
		
		protected void protectedM(){
			System.out.println("Son.protectedM");
		}
		
		protected String returnS(){
			return super.returnS()+ ": "+son;
		}
	}
	public static void main(String[] args) {
		new S().f();// P
		new S().protectedM();
		new S("son");
	}
}

