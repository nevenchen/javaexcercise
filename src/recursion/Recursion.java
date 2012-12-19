package recursion;

public class Recursion {

	static int multiply(int n) {
		if (n == 1 || n == 0)
			return n;
		else
			return n * multiply(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(multiply(10)+"中文");
	}
}
