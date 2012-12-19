package com.neven.java.basic;


/**
 * @Class�?

 * @Description:
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 8 Nov 2010 10:57:15
 * Revision history:
 *
 * @see 	 
 */
public class Important {
	public static void main(String[] args) {
		ifElseTest();
		addAndGiveTest();
	}
	
	/**
	 * @Description:条件表达式结果类型的规则�?
		�?�?如果第二个和第三个操作数具有相同的类型，那么它就是条件表达式的类型�?
		�?�?如果�?��操作的类型是T，T表示byte、short或char，�?另一个操作数是一个int类型的�?字面常量”，并且它的值可以用类型T表示，那条件表达式的类型就是T�?
		�?�?否则，将对操作数类型进行提升，�?条件表达式的类型就是第二个和第三个操作被提升之后的类型�?
		
		现来使用以上规则解上面的迷题，第�?��表达式符合第二条规则：一个操作数的类型是char�?
		另一个的类型是字面常量为0的int型，�?可以表示成char，所以最终返回类型以char类型为准�?
		第二个表达式符合第三条规则：因为i为int型变量，而x又为char型变量，�?��会先将x提升至int型，
		�?���?��的结果类型为int型，
	 *
	 * @author: Neven Chen
	 * @param 
	 * @return void
	 * 
	 * @Exception:
	 */
	static void ifElseTest(){
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);// X
		System.out.println(false ? i : x);// 88
		
		final int j = 0;
		/*
		 * 但如果将i定义成final时，则返回结果类型为char，则此时符合第二条规则，
             因为final类型的变量在编译时就使用“字面常�?”来替换三元表达式了�?
		 */
		System.out.println(false ? j : x);
	}
	
	/**
	 * @Description:
	 *Java语言规范中提到：复合赋�? E1 op= E2等价于简单赋�?E1 = (T)((E1) op (E2))，其中T是E1的类型�?
		复合赋�?表达式自动地将所执行计算的结果转型为其左侧变量的类型。如果结果的类型与该变量的类型相同，
		那么这个转型不会造成任何影响，然而，如果结果的类型比该变量的类型要宽，那么复合赋值操作符将悄悄地执行�?
		个窄化原生类型转换，这样就会导致结果不正确：
		
		使用�?��的赋值方式就不会有这样的问题了，因为宽类型不能自动转换成窄的类型，编译器会报错，
		这时我们就会注意到错误：x = x + i;//编译通不�?
		请不要将复合赋�?操作符作用于byte、short或char类型的变量；在将复合赋�?操作符作用于int类型的变量时�?
		要确保表达式右侧不是long、float或double类型；在将复合赋值操作符作用于float类型的变量时�?
		要确保表达式右侧不是double类型。其实一句：不要将让左侧的类型窄于右侧的数字类型�?
		总之，不要在short、byte或char类型的变量之上使用复合赋值操作符，因为这�?��程会伴随�?��算前类型的提�?
		与计算后结果的截断，导致�?��的计算结果不正确�?
	 * @author: Neven Chen
	 * @param 
	 * @return void
	 * 
	 * @Exception:
	 */
	static void addAndGiveTest(){
		System.out.println("++++++++++++++");
		short x=0;
		int i = 123456;
		x +=i;
		System.out.println(x);//-7616

	}
	
}
