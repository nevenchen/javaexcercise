package interview;

public class Test1 {

	public static void main(String[] args) {
		//method1();
		method4();
	}

	static void method1() {
		String s = null;
		for (int n = 1; n <= 100; n++) {
			s = (n % 15 == 0) ? "FuzzBizz" : (n % 3 == 0) ? "Fuzz" : (n % 5 == 0) ? "Bizz" : Integer.toString(n);
			System.out.println(s);
		}
	}
	
	static void method2(){
		char x = 'X';   
		int i = 0;   
		System.out.println(x - 1);
		System.out.println(true ? x : 0);// X   
		System.out.println(false ? i : x);// 88 
	}
	
	static void mehtod3(){
		int x = (-15) % 4;
		System.out.println(x);
	}
	
	static void method4(){
		int i = 0;
		i++;
		i = i+1;
		System.out.println(i);
	}
}
