package com.publish;

import javax.xml.ws.Endpoint;

import com.endpoint.Convertor;
import com.endpoint.ConvertorImpl;


public class Client {
	public static void main(String[] args) {
		Convertor cs=new ConvertorImpl();
		Endpoint.publish("http://localhost:8085/WS/Convertor",cs);
		System.out.println("service published");
	}

}
