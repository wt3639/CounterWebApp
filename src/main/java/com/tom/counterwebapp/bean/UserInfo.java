package com.tom.counterwebapp.bean;

import java.io.Serializable;

public class UserInfo implements Serializable  {
	private static final long serialVersionUID = 1L;
	private String openid;
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	private String sex;
	private String nickname;
	private Integer height;
	private Integer weight;
	private Integer age;
	private Float sportIndex;
	private Integer aerobic;
	private String goals;
	private Integer energy;
	private Long update_at;
	private Long create_at;
	

	



	public UserInfo(String openid, String sex, String nickname, Integer height, Integer weight, Integer age,
			Float sportIndex, Integer aerobic, String goals, Integer energy, Long update_at, Long create_at) {
		super();
		this.openid = openid;
		this.sex = sex;
		this.nickname = nickname;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.sportIndex = sportIndex;
		this.aerobic = aerobic;
		this.goals = goals;
		this.energy = energy;
		this.update_at = update_at;
		this.create_at = create_at;
	}

	public String getOpenid() {
		return openid;
	}

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Float getSportIndex() {
		return sportIndex;
	}
	public void setSportIndex(Float sportIndex) {
		this.sportIndex = sportIndex;
	}
	public Integer getAerobic() {
		return aerobic;
	}
	public void setAerobic(Integer aerobic) {
		this.aerobic = aerobic;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public Integer getEnergy() {
		return energy;
	}
	public void setEnergy(Integer energy) {
		this.energy = energy;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "UserInfo [openid=" + openid + ", sex=" + sex + ", height=" + height + ", weight=" + weight + ", age="
				+ age + ", sportIndex=" + sportIndex + ", aerobic=" + aerobic + ", goals=" + goals + ", energy="
				+ energy + ", update_at=" + update_at + ", create_at=" + create_at + "]";
	}

}
