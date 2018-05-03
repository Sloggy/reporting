package com.example.renderer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface Renderer {

	@RequestMapping(method = RequestMethod.GET, path = "/accept")
	Accept accept();

	@RequestMapping(method = RequestMethod.GET, path = "/render")
	String render();
}
