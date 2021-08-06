package com.Santana.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("")
	public String dojoHome() {
		return "The dojo is awesome";
	}
	
	@RequestMapping("/{dojoName}-dojo")
	public String location(@PathVariable ("dojoName") String dojoName) {
		if(dojoName.equals("burbank") || dojoName.equals("Burbank")){
			return "Burbank Dojo is located in Southern California.";
		}else if(dojoName.equals("san-jose") || dojoName.equals("San-jose") || dojoName.equals("San-Jose") ) {
			return "SJ dojo is the headquartes.";
		}else return "I don't know that dojo";
	}
}
