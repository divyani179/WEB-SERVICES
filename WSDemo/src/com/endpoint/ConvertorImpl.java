package com.endpoint;

import javax.jws.WebService;

@WebService(endpointInterface="com.endpoint.Convertor")
public class ConvertorImpl implements Convertor {

	@Override
	public int dollarToRupee(int amount) {
		// TODO Auto-generated method stub
		return (50*amount);
	}

}
