package com.example.renderer.docx;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.example.renderer.Accept;

@ConfigurationProperties("renderer")
public class RendererProperties {

	private Accept accept;

	public void setAccept(final Accept pAccept) {
		accept = pAccept;
	}

	public Accept getAccept() {
		return accept;
	}
}
