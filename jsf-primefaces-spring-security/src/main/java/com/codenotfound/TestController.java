package com.codenotfound;


import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * redirect from two controller
 * @author foosi
 *
 */
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
