package interview;

public class String_StringBuffer {

	public static void stringReplace(String text) {
		text = text.replace('j', 'i');
	}

	public static void bufferReplace(StringBuffer text) {
		text = text.append("C");
	}
	
	static void concatTest(){
		String s = "android";
		System.out.println(s.concat("1"));
	}

	public static void main(String args[]) {
		String textString = new String("java");
		StringBuffer textBuffer = new StringBuffer("java");
		stringReplace(textString);
		bufferReplace(textBuffer);
		System.out.println(textString + textBuffer);
		
		concatTest();
	}
}
