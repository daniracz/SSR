package com.ssr;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ssr.FrontService")
public class FrontServiceImpl implements FrontService {

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		return "hello";
	}

}
