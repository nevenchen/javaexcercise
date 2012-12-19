package finalize;


public class C {
	
	public static void main(String[] args) throws InterruptedException{
		A a = new A();
		a = null;
		System.gc();
		Thread.sleep(5000);   
        B.a.saySomething();   
        a.saySomething();

	}
}
