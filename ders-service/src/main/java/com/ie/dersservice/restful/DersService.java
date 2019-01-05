package com.ie.dersservice.restful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DersService {
	
	@Autowired
	Environment environment;
	
	@GetMapping(value="/port")
	public String ders() {
		return "Ders Servisi : " + environment.getProperty("local.server.port");
	}
}
