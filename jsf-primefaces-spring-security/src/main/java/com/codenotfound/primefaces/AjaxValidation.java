package com.codenotfound.primefaces;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
public class AjaxValidation {
	private String firstname;
	private String lastname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void save() {
		//FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + firstname + "" + lastname));
		FacesContext context = FacesContext.getCurrentInstance();
		
		FacesContext.getCurrentInstance().addMessage("mainForm:msgs2", new FacesMessage("Welcome " + firstname + "" + lastname));
	}
}