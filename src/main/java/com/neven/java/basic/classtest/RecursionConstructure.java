package com.neven.java.basic.classtest;

public class RecursionConstructure {

	//private RecursionConstructure	instance	= new RecursionConstructure();

	public RecursionConstructure() {
		System.out.println("init.....");
	}
	
	public static void main(String[] args) {
		//new RecursionConstructure();
		new ConstructureConfuse(null);
	}
}

/**
 * @Class：null可代表任何非基本类型对象
	Java的重载解析过程是分两阶段运行的
	第一阶段选取 ? 可获得并且可应用的方法或构 ?器 ?
	第二阶段在第 ? 段 ?取的方法或构造器中 ?取最精确的一个 ?
	
	如果 ? 方法或构造器可以接受传 ?给另 ? 方法或构造器的任何参数，那么我们就说第一个方法比第二个方法缺乏精确 ? ?
	调用时就会 ?取第二个方法 ?
	
	使用上面的规则来解释该程序：构 ?器Confusing(Object o)可以接受任何传 ?Confusing(double[] dArr)的参数，
	因此Confusing(Object o)相对缺乏精确性， ? Confusing(null)会调用Confusing(double[] dArr)构 ?器 ?

 * @Description:
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 8 Nov 2010 13:40:52
 * Revision history:
 *
 * @see 	 
 */
class ConstructureConfuse{
	public ConstructureConfuse(Object o){
		System.out.println("Object is passing: "+o);
	}
	public ConstructureConfuse(Integer x){
		System.out.println("Integer is passing: "+x);
	}
}