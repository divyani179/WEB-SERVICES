package com.test;

public class Client {
	public static void main(String[] args) {
		CalculatorImplService service =new CalculatorImplService();
		CalculatorImpl calc=service.getCalculatorImplPort();
		
		System.out.println("added value "+calc.add(10,20));
	}

}
