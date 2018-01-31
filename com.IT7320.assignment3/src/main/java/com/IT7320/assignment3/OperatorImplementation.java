package com.IT7320.assignment3;

public class OperatorImplementation implements IOperator {
	
	IOperator result; 

	public int add(int x, int y) {
		return result.add(x, y);
	}

	public int subtract(int x, int y) {
		return result.subtract(x, y);
	}

	public int multiply(int x, int y){
		return result.multiply(x, y);
	}

	public int divide(int x, int y) {
		return result.divide(x, y);
	}

	public void setResult(IOperator result) {
		this.result = result;
	}

}
