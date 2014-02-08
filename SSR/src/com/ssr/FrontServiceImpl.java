package com.ssr;

import javax.jws.WebService;

@WebService(endpointInterface = "com.test.WebServiceInterface")
public class FrontServiceImpl implements FrontService {

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		return "hello";
	}

}
