package com.neven.java.basic;

public class InnerClassTest2 {

	public static interface MyInterface {
		void action();
	}

	private static MyInterface newAction(final int b /* 必须是final */) {
		MyInterface action;
		{
			final int a = 10; // 必须是final

			action = new MyInterface() {
				public void action() {
					System.out.println(a + b); // 内部类对象直接引用外部方法的局部变量
				}
			};
		}

		// System.out.println(a); //编译错误，已经超出a的作用域了
		return action;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyInterface actor = newAction(5);

		actor.action(); // 结果为15, 现在局部变量a和b被actor对象持有了（作为其自由变量）
	}
}
