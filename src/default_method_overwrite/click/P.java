package default_method_overwrite.click;


public class P {
	public void f() {
		//因为子类没有重写该方法，所以调用的还是父类中的方法
		prt();
		protectedM();
		System.out.println("returnS run in fathe-"+returnS());
	}
	/**
	 * @Description:由于prt()的defult访问权限仅仅限于包内，所以当P在包外被继承的时候
	 * prt()不被察觉，故不会被重写
	 *
	 * @author: Neven Chen
	 * @param 
	 * @return void
	 * 
	 * @Exception:
	 */
	void prt() {
		System.out.println("Father.prt");
	}
	
	/**
	 * @Description:由于protectedM()的protected访问权限在包外的子类依然可见，所以当P在包外被继承的时候
	 * protectedM()会被重写
	 *
	 * @author: Neven Chen
	 * @param 
	 * @return void
	 * 
	 * @Exception:
	 */
	protected void protectedM(){
		System.out.println("Father.protectedM");
	}
	
	protected String returnS(){
		return "Father.returnS";
	}
}
