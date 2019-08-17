package com.codenotfound.primefaces;

import java.util.Locale;

import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Named
public class HelloWorld {

  private String firstName = "";
  private String lastName = "";

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
}
