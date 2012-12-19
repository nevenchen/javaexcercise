package deprecated;


public class DeprecatedTest {

	/**
	 * @Description:
	 *
	 * @author: Neven Chen
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) {
		System.out.println(9.5*0.84);
		// TODO Auto-generated method stub
		try {
			isDeprecatedMethod();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Deprecated
	public static void isDeprecatedMethod() throws Exception{
		System.out.println("the deprecated method is running.");
			throw new Exception("this method is not suggested to use any more.");
	}
}
