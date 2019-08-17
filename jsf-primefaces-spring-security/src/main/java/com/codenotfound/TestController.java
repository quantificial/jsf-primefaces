package com.codenotfound;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named
public class TestController {
	
	public String processPage1(){
		return "success";
	}
	
	public String processPage2(){
		return "success";
	}
	
}
