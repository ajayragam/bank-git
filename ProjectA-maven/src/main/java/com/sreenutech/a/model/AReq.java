package com.sreenutech.a.model;

import lombok.Data;

@Data
public class AReq {
	

	private String oid;
	private String name;
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	@Override
	public String toString() {
		return "AReq [oid=" + oid + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
   
}
