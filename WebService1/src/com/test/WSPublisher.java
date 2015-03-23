package com.test;

import javax.xml.ws.Endpoint;

public class WSPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CalculatorWS cs=new CalculatorImpl();
Endpoint.publish("http://localhost:8085/WS/Calculator",cs);
System.out.println("service published");
	}

}
