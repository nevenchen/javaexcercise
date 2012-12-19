package ClassTest;


/**
 * @Class：
 * @Description:
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 8 Nov 2010 13:58:53
 * Revision history:
 *
 * @see 	 
 */
public class StaticMethodOverload extends Father{
	
	public static void main(String[] args) {
		//testStaticMethod();
		testHideFatherField();
	}
	
	/**
	 * @Description:对静态方法的调用不存在任何动态的分派机制。当一个程序调用了一个静态方法时，
	 * 要被调用的方法都是在编译时就被选定的，
	 * 即调用哪个方法是根据该引用被声明的类型决定的。上面程序中a1与a2引用的类型都是A1类型，
	 * 所以调用的是A1中的f()方法。
	 *
	 * @author: Neven Chen
	 * @param 
	 * @return void
	 * 
	 * @Exception:
	 */
	static void testStaticMethod(){

		Father father = new Father();
		Son son = new Son();
		
		father.normalFun();
		father.staticFun();
		
		son.normalFun();
		son.staticFun();
		
		Father son2 = new Son();
		son2.staticFun();
		son2.normalFun();
		
	}
	
	static void testHideFatherField(){
		// !! Father.name is not visible
		System.out.println(new Father().name);
		//System.out.println(new Son().name);
		// 属性不能被重写，只是被隐藏，所以不具有多态性为
		System.out.println(((Father) new Son()).name);// p

	}
}

abstract class GrandFather{
	abstract void abstractMethod();
	public void smoke(){}
}

class Father extends GrandFather{
	
	@Override
	void abstractMethod() {
	}
	
	public String name = "father";
	
	public static void staticFun(){
		System.out.println("father.staticFun()");
	}
	void normalFun(){
		System.out.println("father.normalFun()");
	}
}

class Son extends Father{
	//用private来重新定义“name”，是修改父类的“name”为隐藏，而不是像方法一样重载了一个新的“Son.name”
	private String name = "son";
	
	public static void staticFun(){
		System.out.println("son.staticFun()");
	}
	void normalFun(){
		System.out.println("son.normalFun()");
	}
}
