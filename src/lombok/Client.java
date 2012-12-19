package lombok;


public class Client {

	/**
	 * @Description:
	 *
	 * @author name: neven
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LombokTest test = new LombokTest();
		test.setParam("This field automatic set by lombok, it's cool!");
		System.out.println(test.getParam());
	}
}
