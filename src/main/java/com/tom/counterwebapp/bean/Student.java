package com.tom.counterwebapp.bean;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Long id;
	public Student(Long id, String name, String qq, String type, String enterDate, String school, String stId,
			String link, String word, String tA, String source, Long update_at, Long create_at) {
		super();
		this.id = id;
		this.name = name;
		this.qq = qq;
		this.type = type;
		this.enterDate = enterDate;
		this.school = school;
		this.stId = stId;
		this.link = link;
		this.word = word;
		this.tA = tA;
		this.source = source;
		this.update_at = update_at;
		this.create_at = create_at;
	}
	private String name;
	private String qq;
	private String type;
	private String enterDate;
	private String school;
	private String stId;
	private String link;
	private String word;
	private String tA;
	private String source;
	private Long update_at;
	private Long create_at;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getStId() {
		return stId;
	}
	public void setStId(String stId) {
		this.stId = stId;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String gettA() {
		return tA;
	}
	public void settA(String tA) {
		this.tA = tA;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Long getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Long update_at) {
		this.update_at = update_at;
	}
	public Long getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Long create_at) {
		this.create_at = create_at;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qq=" + qq + ", type=" + type + ", enterDate=" + enterDate
				+ ", school=" + school + ", stId=" + stId + ", link=" + link + ", word=" + word + ", tA=" + tA
				+ ", source=" + source + ", update_at=" + update_at + ", create_at=" + create_at + "]";
	}
}
