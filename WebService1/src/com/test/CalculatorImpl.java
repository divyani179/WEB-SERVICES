package com.test;

import javax.jws.WebService;

@WebService
public class CalculatorImpl implements CalculatorWS {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
        return x+y;
	}

	@Override
	public float subtract(float a, float b) {
		return a-b;
		// TODO Auto-generated method stub

	}

}
