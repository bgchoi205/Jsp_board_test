package com.cbg.exam1.interceptor;

import com.cbg.exam1.http.Rq;

public class NeedLogoutInterceptor extends Interceptor {

	@Override
	public boolean runBeforeAction(Rq rq) {
		return true;
	}
	
}