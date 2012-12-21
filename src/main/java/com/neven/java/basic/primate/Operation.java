package com.neven.java.basic.primate;

import org.junit.Test;

public class Operation {
	/**
	 * 条件表达式结果类型的规则： 
	 * （1） 如果第二个和第三个操作数具有相同的类型，那么它就是条件表达式的类型。
	 * （2）如果一个操作的类型是T，T表示byte、short或char，而另一个操作数是一个int类型的“字面常量” 并且它的值可以用类型T表示，那条件表达式的类型就是T。
	 * （3）否则，将对操作数类型进行提升，而条件表达式的类型就是第二个和第三个操作被提升之后的类型。
	 * 
	 * 现来使用以上规则解上面的迷题，第一个表达式符合第二条规则：一个操作数的类型是char，另一个的类型是字面常量为0的int型，但0可以表示成char
	 * ，所以最终返回类型以char类型为准；第二个表达式符合第三条规则：因为i为int型变量，而x又为char型变量，所以会先将x提升至int型，
	 * 所以最后的结果类型为int型
	 * 
	 */
	@Test
	@SuppressWarnings("unused")
	public void ifElseTest() {
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);// X
		System.out.println(false ? i : x);// 88

		final int j = 0;
		/*
		 * 但如果将i定义成final时，则返回结果类型为char，则此时符合第二条规则，因为final类型的变量在编译时就使用“字面常量0”
		 * 来替换三元表达式了：
		 */
		System.out.println(false ? j : x);
	}
	
	/**
	 * x+=i与x=x+i等效吗，许多程序员都会认为第一个表达式x+=i只是第二个表达式x=x+i的简写方式，但这并不准确。
	 * 
	 * Java语言规范中提到：
	 * 复合赋值 E1 op= E2等价于简单赋值 E1 = (T)((E1) op (E2))，其中T是E1的类型。
	 * 
	 * 复合赋值表达式自动地将所执行计算的结果转型为其左侧变量的类型。
	 * 如果结果的类型与该变量的类型相同，那么这个转型不会造成任何影响，
	 * 然而，如果结果的类型比该变量的类型要宽，那么复合赋值操作符将悄悄地执行一个窄化原生类型转换，这样就会导致结果不正确：

	 */
	@Test
	public void addAndGiveTest() {
		System.out.println("++++++++++++++");
		short x = 0;
		int i = 123456;
		x += i;
		System.out.println(x);// -7616
		System.out.println((short) i);//-7616
		
		/*
		 * 使用简单的赋值方式就不会有这样的问题了，因为宽类型不能自动转换成窄的类型，编译器会报错，这时我们就会注意到错误
		 */
		//x = x+i;

	}
	
	@Test
	public void selfPlus(){
		int k = 0; 
		k = k++;
		System.out.println(k);
		
//		上面的程序会输出什么？大部分会说是 1，是也，非也。运行时正确结果为0。
//
//		i=++i;相当于以下二个语句（编译时出现警告，与i=i;警告相同）：
//		i=i+1;
//		i=i;
//
//		i = i++;相当于以下三个语句：
//		int tmp = i;
//		i = i + 1;
//		i = tmp;
//		下面看看下面程序片段：
		int i = 0, j = 0, y = 0;
		i++;//相当于：i=i+1;
		System.out.println("i=" + i);// i=1
		++i;//相当于：i=i+1;
		System.out.println("i=" + i);// i=2
		i = i++;//相当于：int tmp=i;i=i+1;i=tmp;
		System.out.println("i=" + i);// i=2
		i = ++i;//编译时出现警告，与i=i;警告相同。相当于：i=i+1;i=i;
		System.out.println("i=" + i);// i=3
		j = i++;//相当于：int tmp=i;i=i+1;j=tmp;
		System.out.println("j=" + j);// j=3
		System.out.println("i=" + i);// i=4
		y = ++i;//相当于：i=i+1;y=i;
		System.out.println("y=" + y);// y=5
		System.out.println("i=" + i);// i=5

	}
	
	@Test
	public void mathTest(){

		System.out.println("Math.round(11.5): " +Math.round(11.5));
		System.out.println("Math.round(11.4): " +Math.round(11.4));
		System.out.println("Math.round(11): " +Math.round(11));
		System.out.println("Math.round(0.5): " +Math.round(0.5));
		System.out.println("Math.round(0.4): " +Math.round(0.4));
		System.out.println("Math.round(0): " +Math.round(0));
		System.out.println("Math.round(-0.4): " +Math.round(-0.4));
		System.out.println("Math.round(-0.5): " +Math.round(-0.5));
		System.out.println("Math.round(-11): " +Math.round(-11));
		System.out.println("Math.round(-11.4): " +Math.round(-11.4));
		System.out.println("Math.round(-11.5): " +Math.round(-11.5));
		System.out.println("Math.round(-11.6): " +Math.round(-11.6));
		System.out.println("===================");
		System.out.println(Math.floor(11.9));
		System.out.println(Math.floor(11.6));
		System.out.println(Math.floor(11.5));
		System.out.println(Math.floor(11.4));
		System.out.println(Math.floor(11));
		System.out.println(Math.floor(0.1));
		System.out.println(Math.floor(0));
		System.out.println(Math.floor(-0.1));
		System.out.println(Math.floor(-11));
		System.out.println(Math.floor(-11.4));
		System.out.println(Math.floor(-11.5));
		System.out.println(Math.floor(-11.6));
		System.out.println(Math.floor(-11.9));
		System.out.println("===================");
		System.out.println(Math.ceil(11.9));
		System.out.println(Math.ceil(11.6));
		System.out.println(Math.ceil(11.5));
		System.out.println(Math.ceil(11.4));
		System.out.println(Math.ceil(11));
		System.out.println(Math.ceil(0.1));
		System.out.println(Math.ceil(0));
		System.out.println(Math.ceil(-0.1));
		System.out.println(Math.ceil(-11));
		System.out.println(Math.ceil(-11.4));
		System.out.println(Math.ceil(-11.5));
		System.out.println(Math.ceil(-11.6));
		System.out.println(Math.ceil(-11.9));
	}
}
