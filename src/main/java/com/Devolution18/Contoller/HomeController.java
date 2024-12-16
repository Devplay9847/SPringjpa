package com.Devolution18.Contoller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
	        model.addAttribute("msg", "Hello, Thymelexaf!");
	        return "index"; // returns index.html template
	    }
	

//	   @GetMapping("/")
//	    public ResponseEntity<String> home() {
//	        String message = "Hello, Thymeleaf!";
//	        
//	        HttpHeaders headers = new HttpHeaders();
//	        headers.add("Custom-Header", "CustomValue");
//	        
//	        return new ResponseEntity<>(message, headers, HttpStatus.OK);
//	    }
}

