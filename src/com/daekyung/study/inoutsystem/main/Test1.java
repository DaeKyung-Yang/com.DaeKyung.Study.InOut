package com.daekyung.study.inoutsystem.main;

import com.daekyung.study.inoutsystem.manager.*;

public class Test1 {
	
	private InOutManager mgr;
	
	public void t() {
		mgr.setCeoListener(new CeoInListener() {
			public void ceoIn() {
				// 여기서 CEO 가 들어온 것을 알 수 있다. 
				System.out.println("사장님 휴게실 입장.");
			}
		});
		
		
	}

}
