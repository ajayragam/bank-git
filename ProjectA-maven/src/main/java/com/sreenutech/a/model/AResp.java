package com.sreenutech.a.model;

import lombok.Data;

@Data
public class AResp {
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AResp [status=" + status + "]";
	}
	
	

}
