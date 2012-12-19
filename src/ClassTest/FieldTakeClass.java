package ClassTest;

import ClassTest.X.Y;


/**
 * @Class：
 * @Description:当一个变量和一个类型具有相同的名字，并且它们位于相同的作用域时，
 * 变量名具有优先权。变量名将遮掩类型名。相似地，变量名和类型名可以遮掩包名。
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 8 Nov 2010 14:12:33
 * Revision history:
 *
 * @see 	 
 */
public class FieldTakeClass {
	public static void main(String[] args) {
		System.out.println(X.Y.Z);
		Y y = new X.Y();
		System.out.println(y.Z);
		System.out.println(((X.Y)null).Z);
	}
}
class X {
	static class Y {
		static String Z = "Black";
	}
	static C Y = new C();
}
class C {
	String Z = "White";
}
