package com.codenotfound.primefaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Named;

@Named
public class AutoComplete {
	String countryName;

	public List<String> countryList(String s) {
		ArrayList<String> list = new ArrayList<>();
		list.add("India");
		list.add("Australia");
		list.add("Germany");
		list.add("Italy");
		list.add("United States");
		list.add("Russia");
		
		return list.stream().filter(e -> e.contains(s)).collect(Collectors.toList());
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String CountryName) {
		this.countryName = CountryName;
	}
}