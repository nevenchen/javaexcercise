package ClassTest;


public class Twistted {
	private String name;
	Twistted(String name) {
		this.name = name;
	}
	// 私有的不能被继承，但能被內部类直接访问
	private String name() {
		return name;
	}
	public String getName(){
		return name;
	}
	private void reproduce() {
		//此处为匿名内部类，“reproduce”会赋值给此匿名对象，
		//name()为private，无法从父类继承，故调用的时候其实是调用父类的name()，返回的是父类的“name”
		//getName()为public，从父类继承，故调用的时候其实是调用自己的getName()，返回的是子类的“name”
		new Twistted("reproduce") {
			void printName() {
				// name()为外部类的，因为没有被继承过来
				System.out.println(name());
				System.out.println(getName());
			}
		}.printName();
	}

	public static void main(String[] args) {
		new Twistted("main").reproduce();
	}
}

