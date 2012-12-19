package compare.comparable;

import java.util.Arrays;

public class ComparableDemo implements Comparable {

	private double	a	= Math.random();

	public String toString() {
		return "" + a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableDemo[] c = new ComparableDemo[] { new ComparableDemo(), new ComparableDemo(), new ComparableDemo() };
		System.out.println(Arrays.asList(c));
		Arrays.sort(c);
		System.out.println(Arrays.asList(c));
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof ComparableDemo) {
			if (a > ((ComparableDemo) o).a) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			throw new ClassCastException("Can't compare!");
		}
	}
}
