package com.neven.java.basic.codepiece;


/**
 * @Class?
 * @Description:抽象类可以继承一个抽象类或?实体，同时还可以实现接口
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 4 Nov 2010 13:53:25
 * Revision history:
 *
 * @see 	 
 */
public abstract class AbstractClassTest extends SuperAbstract implements Runnable{
    abstract class Test{
	}
}

abstract class SuperAbstract{
	/**
	 * @Description:抽象方法不能同步，原因：既然是抽象方法，你都不知道实现的时?具体会干?，?在这里就要求同步没有意义
	 *
	 * @author: Neven Chen
	 * @param 
	 * @return void
	 * 
	 * @Exception:
	 */
	public abstract void method();
}
//接口可以继承另外的接口，但是不能实现另外的接口?（implements就是要来实现的）
interface TestInterfaceA extends TestInterfaceB{}
//interface TestInterfaceA extends TestInterfaceB implements Runnable{}

interface TestInterfaceB{}
