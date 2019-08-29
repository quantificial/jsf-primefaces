package com.codenotfound.primefaces;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@RequiredArgsConstructor
public class People {
	
	private String name;
	private String role;
	private int age;
	
	public People(String name, String role, int age) {
		this.name = name;
		this.role = role;
		this.age = age;
	}
			

}
