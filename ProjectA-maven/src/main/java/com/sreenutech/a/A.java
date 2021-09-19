package com.sreenutech.a;

import com.sreenutech.a.model.AReq;
import com.sreenutech.a.model.AResp;
import com.sreenutech.b.B;
import com.sreenutech.b.model.BReq;
import com.sreenutech.b.model.BResp;

public class A {
	public AResp m1(AReq areq) {
		
		System.out.println("entered into A: " +areq);
		BReq breq = new BReq();
		
	
		breq.setOid(areq.getOid());
		breq.setName(areq.getName());
		
		B b=new B();
		BResp bresp = b.m1(breq);
		
		AResp aresp =new AResp();
		aresp.setStatus(bresp.getStatus());
		
		System.out.println("exit from A: " +areq);
		return aresp;
		
	}

}
