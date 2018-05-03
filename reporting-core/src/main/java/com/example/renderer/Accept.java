package com.example.renderer;

import java.util.HashSet;
import java.util.Set;

public class Accept {

	private Set<String> fTemplateTypes = new HashSet<>();
	private Set<String> fDataTypes = new HashSet<>();
	private Set<String> fDocumentTypes = new HashSet<>();

	/**
	 * @return the fTemplateTypes
	 */
	public Set<String> getTemplateTypes() {
		return fTemplateTypes;
	}

	/**
	 * @param fTemplateTypes the fTemplateTypes to set
	 */
	public void setTemplateTypes(Set<String> fTemplateTypes) {
		this.fTemplateTypes = fTemplateTypes;
	}

	/**
	 * @return the fDataTypes
	 */
	public Set<String> getDataTypes() {
		return fDataTypes;
	}

	/**
	 * @param fDataTypes the fDataTypes to set
	 */
	public void setDataTypes(Set<String> fDataTypes) {
		this.fDataTypes = fDataTypes;
	}

	/**
	 * @return the fDocumentTypes
	 */
	public Set<String> getDocumentTypes() {
		return fDocumentTypes;
	}

	/**
	 * @param fDocumentTypes the fDocumentTypes to set
	 */
	public void setDocumentTypes(Set<String> fDocumentTypes) {
		this.fDocumentTypes = fDocumentTypes;
	}	
}
