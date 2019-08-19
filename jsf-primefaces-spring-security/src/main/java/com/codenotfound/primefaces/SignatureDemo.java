package com.codenotfound.primefaces;

import javax.inject.Named;

@Named
public class SignatureDemo {
	private String signature;

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
}

