package com.codenotfound.primefaces;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Named
@RequestScoped
@Data
@Slf4j
public class DummyModel {
	
	private String componentSuite = "RichFaces";
	
	private double param1;
	private double param2;
	
	private double result;
	
	private String dummy1 = "dummy1";
	private String dummy2 = "dummy2";
	
	private String hiddenMessage ="this is a hidden message";
	
	public void add() {
		result = param1+param2;
	}
	
	public void addListener() {
		result = param1+param2;
	}
	
    public void showMessage() {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "summary", "details");
        FacesContext.getCurrentInstance().addMessage("msg", facesMsg);
    }
    
    public String nav() {
    	log.info("#####test");
    	return "tinycalculator";
    }
    
    public String msg() {
    	return "this is msg";
    }
    
    public List<Dummy> getDummyData() {
    	
    	List<Dummy> a = new ArrayList<Dummy>();
    	
    	a.add(new Dummy(1,"abc","message 1"));
    	a.add(new Dummy(2,"xyz","message 2"));
    	
    	Dummy b = new Dummy(2,"xyz","message 2");    	
        	
    	
    	
    	return a;
    }
    
    
    @Data
    public class Dummy {
    	
    	private int id;
    	private String name;
    	private String message;
    	
    	Dummy(int i, String n, String m) {
    		this.id=i;
    		this.name=n;
    		this.message=m;
    	}
    	
    }
    
     

}
