package com.neven.java.basic.collection;

public class Comparators {

	public static java.util.Comparator getComparator() {
		return new java.util.Comparator() {

			public int compare(Object o1, Object o2) {
				if (o1 instanceof String) {
					return compare((String) o1, (String) o2);
				}
				else if (o1 instanceof Integer) {
					return compare((Integer) o1, (Integer) o2);
				}
				else if (o1 instanceof Person) {
					return compare((Person) o1, (Person) o2);
				}
				else {
					System.err.println("未找到合适的比较器");
					return 1;
				}
			}

			public int compare(String o1, String o2) {
				String s1 = (String) o1;
				String s2 = (String) o2;
				int len1 = s1.length();
				int len2 = s2.length();
				int n = Math.min(len1, len2);
				char v1[] = s1.toCharArray();
				char v2[] = s2.toCharArray();
				int pos = 0;
				while (n-- != 0) {
					char c1 = v1[pos];
					char c2 = v2[pos];
					if (c1 != c2) {
						return c1 - c2;
					}
					pos++;
				}
				return len1 - len2;
			}

			public int compare(Integer o1, Integer o2) {
				int val1 = o1.intValue();
				int val2 = o2.intValue();
				return (val1 < val2 ? -1 : (val1 == val2 ? 0 : 1));
			}

			public int compare(Boolean o1, Boolean o2) {
				return (o1.equals(o2) ? 0 : (o1.booleanValue() == true ? 1 : -1));
			}

			public int compare(Person o1, Person o2) {
				String firstname1 = o1.getFirstName();
				String firstname2 = o2.getFirstName();
				String lastname1 = o1.getLastName();
				String lastname2 = o2.getLastName();
				Boolean sex1 = o1.getSex();
				Boolean sex2 = o2.getSex();
				Integer age1 = o1.getAge();
				Integer age2 = o2.getAge();
				return (
					compare(firstname1, firstname2) == 0 ? 
						(compare(lastname1, lastname2) == 0 ? 
						   (compare(sex1, sex2) == 0 ? 
					          (compare(age1, age2) == 0 ? 0: compare(age1, age2))
						   : compare(sex1, sex2))
						: compare(lastname1, lastname2))
					: compare(firstname1, firstname2));
			}
		};
	}
}
