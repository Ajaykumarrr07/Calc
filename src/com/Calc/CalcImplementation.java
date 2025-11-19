package com.Calc;

public class CalcImplementation  implements Calc {
	
	@Override
	public int add(int a, int b) {
		int c=a+b;
		return c;
		
	}
	@Override
	public double div(int a, int b) {
		// implemented by maniteja
		int c=a/b;
		return c;
		
	}
	@Override
	public int mul(int a, int b) {
		// implemented by Ajay mul method
		
		int c = a*b;
				
		return c;
	} @Override
	public double sub(int a, int b) {
		// implemented by Ajay sub method
		int c = a-b;
		
		return c;
		
	}
}
