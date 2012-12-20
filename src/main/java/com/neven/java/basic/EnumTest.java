package com.neven.java.basic;

import java.util.Arrays;

public class EnumTest {

	/**
	 * @Description:
	 * 
	 * @author: Neven Chen
	 * @param
	 * @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Operation.PLUS.eval(1, 2));
		System.out.println(OneValueEnum.A.getValue());
		OneValueEnum.A.printThis();
		System.out.println(OneValueEnum.B.getValue());
		System.out.println(OneValueEnum.C);
		System.out.println(ValueEnum.three.getValue());
		System.out.println(Arrays.asList( ValueEnum.values()));
	}

	static enum Operation {
		PLUS {

			double eval(double x, double y) {
				return x + y;
			}
		},
		MINUS {

			double eval(double x, double y) {
				return x - y;
			}
		},
		TIMES {

			double eval(double x, double y) {
				return x * y;
			}
		},
		DIVIDE {

			double eval(double x, double y) {
				return x / y;
			}
		};

		abstract double eval(double x, double y);
	}

	static enum OneValueEnum {
		A{
			public void printThis() {
				System.out.println(this);
			}
		},
		B{
			public void printThis() {
				System.out.println(this);
			}
		},
		C{
			public void printThis() {
				System.out.println(this);
			}
		},
		D() {
			public void printThis() {
				System.out.println(this);
			}
		};

		String	value;

		OneValueEnum() {
			value = "TheOne";
		}

		public String getValue() {
			return this.value;
		}

//		public String toString() {
//			return this.value;
//		}

		abstract void printThis();
	}
	
	static enum ValueEnum{
		
		one(1),two(2),three(3);
		
		int value = 0;
		ValueEnum(int value){
			this.value = value;
		}
		
		public int getValue(){
			return this.value;
		}
	}
}
