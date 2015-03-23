package com.client;

import java.net.MalformedURLException;
import java.net.URL;




import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.test.CalculatorImpl;

public class Client1 {
public static void main(String[] args) {
	URL u=null;
	try {
		u=new URL("http://localhost:8085/WS/Calculator?wsdl");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	QName serviceName=new QName("http://test.com/","CalculatorImplService");
	Service service=Service.create(u,serviceName);
	CalculatorImpl calc=service.getPort(CalculatorImpl.class);
	System.out.println(calc.add(10, 100));
}
}
