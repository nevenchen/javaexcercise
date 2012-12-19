package objectsort;

public class Person {

	String	firstname, lastname;
	Boolean	sex;
	Integer	age;

	public Person(String firstname, String lastname, Boolean sex, Integer age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.sex = sex;
		this.age = age;
	}

	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public Boolean getSex() {
		return sex;
	}

	public Integer getAge() {
		return age;
	}

	// 为了输入方便，重写了toString()
	public String toString() {
		return firstname + " " + lastname + " " + (sex.booleanValue() ? "男" : "女") + " " + age;
	}
}
