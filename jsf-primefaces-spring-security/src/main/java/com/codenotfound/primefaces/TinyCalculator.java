package com.codenotfound.primefaces;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import lombok.Data;


@Named
@RequestScoped
@Data
public class TinyCalculator {
	
	private String componentSuite = "RichFaces";
	
	private double param1;
	private double param2;
	
	private double result;
	
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

}
