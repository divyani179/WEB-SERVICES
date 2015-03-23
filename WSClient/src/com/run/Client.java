package com.run;

import com.endpoint.*;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertorImplService service =new ConvertorImplService();
		ConvertorImpl calc=service.getConvertorImplPort();
		
		System.out.println("added value "+calc.dollarToRupee(23));
	}

}
