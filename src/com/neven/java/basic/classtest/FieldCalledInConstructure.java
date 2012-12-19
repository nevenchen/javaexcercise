package com.neven.java.basic.classtest;


public class FieldCalledInConstructure {
		// 先于静�?常量t初始化，固可以在构�?器中正常使用
		private static final int y = getY();
		/*
		 * 严格按照静�?常量声明的先后顺来初始化：即t初始
		 * 化完后，才初始化后面的静态常量j，所以构造器�?
		 * 引用后面的静态常量j时，会是0，即内存清零时的�?
		 */
		public static final FieldCalledInConstructure t = new FieldCalledInConstructure();
		// 后于静�?常量t初始化，不能在构造器中正常使�?
		private static final int j = getJ();
		private final int i;

		static int getY() {
			return 2;
		}

		static int getJ() {
			return 2;
		}

		// 单例
		private FieldCalledInConstructure() {
			i = y - j - 1;
	//为什么j不是2
			System.out.println("y=" + y + " j=" + j);// y=2 j=0
		}

		public int getI() {
			return i;
		}

		public static void main(String[] args) {
			System.out.println(FieldCalledInConstructure.t.getI());// 1
			System.out.println(FieldCalledInConstructure.j);// 2
		}

}
