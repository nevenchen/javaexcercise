package codepiece;


public class LongEqualTest {
	public static void main(String[] args){
		Long a = Long.parseLong("2");
		Long b = Long.parseLong("2");
		if(a==b){
			System.out.println("Class Long can be compared by ==");
		}
	}
}
