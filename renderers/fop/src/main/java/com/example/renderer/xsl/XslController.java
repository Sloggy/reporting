package com.example.renderer.xsl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XslController {

	@GetMapping("/render")
	public String render() {
		return "xsl";
	}
}
