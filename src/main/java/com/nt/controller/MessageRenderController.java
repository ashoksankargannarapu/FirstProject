package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/messageapi")//global path
public class MessageRenderController {
	@GetMapping("/api")
	public String registerCustomer(@RequestParam int cno,@RequestParam(required = true,defaultValue = "rama") String cname) {
		return cno+"--"+cname;
	}
	
	
}
