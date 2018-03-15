package com.tom.counterwebapp.bean;

import java.io.Serializable;

public class Advertisement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private Boolean updateFlag;
	private String text;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getUpdateFlag() {
		return updateFlag;
	}
	public void setUpdateFlag(Boolean updateFlag) {
		this.updateFlag = updateFlag;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Advertisement(String id, Boolean updateFlag, String text) {
		super();
		this.id = id;
		this.updateFlag = updateFlag;
		this.text = text;
	}
	public Advertisement() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Advertisement [id=" + id + ", updateFlag=" + updateFlag + ", text=" + text + "]";
	}
	
	
	
	

}
