package com.example.renderer.docx;

import org.springframework.web.bind.annotation.RestController;

import com.example.renderer.Accept;
import com.example.renderer.Renderer;

@RestController
public class DocxController implements Renderer {

	final Accept fAccept;

	public DocxController(final RendererProperties pProperties) {
		fAccept = pProperties.getAccept();
	}

	public String render() {
		return "docx";
	}

	@Override
	public Accept accept() {
		return fAccept;
	}
}
