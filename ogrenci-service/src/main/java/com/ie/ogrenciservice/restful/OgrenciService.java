package com.ie.ogrenciservice.restful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OgrenciService {
	@Autowired
	Environment environment;
	
	@GetMapping(value="/port")
	public String ogrenci() {
		return "Ogrenci Servisi : " + environment.getProperty("local.server.port");
	}
}
