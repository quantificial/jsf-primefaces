package com.codenotfound;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestDummyAuth {

	@RequestMapping("/set")
	public Object set() {
		
		SecurityContext context = SecurityContextHolder.getContext();
		
		//UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken("abc", "123");
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		
		UserDetails user = new User("user@example.com", "123", authorities);
			
		Authentication authentication = new UsernamePasswordAuthenticationToken(user, "123", authorities);
		//authentication.setAuthenticated(true);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
	
		log.info(SecurityContextHolder.getContext().getAuthentication().toString());
        
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		//logger.debug("Logging in with [{}]", authentication.getPrincipal());
		
		return principal;
	}
	
	@RequestMapping("/me")
    public Principal user(Principal principal) {
        System.out.println(principal);
        return principal;
    }
	
}
