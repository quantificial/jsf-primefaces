package com.codenotfound.primefaces;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Named
@SessionScoped
public class HelloWorld implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 3319622763326151979L;
private String firstName = "";
  private String lastName = "";
  
  private String value="";
  
  

  public String getValue() {
	return value;
}

	public void setValue(String value) {
		this.value = value;
	}

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
	  
    Authentication authentication =
        SecurityContextHolder.getContext().getAuthentication();
    
    FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.CHINESE);

    return "Hello " + authentication.getName() + "!";
  }
  
  @Autowired
  HttpSession httpSession;
  
  public String sessionId() {
	  	  	  
	  return httpSession.getId();
  }
  
  public String sessionValue() {
	  
	  String value = (String)httpSession.getAttribute("secret");
	  
	  if(value == null)
		  value = "empty";
	  
	  return value;
  }
  
  public boolean assignSession() {
	  httpSession.setAttribute("secret", this.value);
	  
	  System.out.println("setting secret session");
	  
	  return true;
  }
}
