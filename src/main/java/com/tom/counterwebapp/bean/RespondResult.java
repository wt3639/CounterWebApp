package com.tom.counterwebapp.bean;

import java.io.Serializable;

public class RespondResult implements Serializable {
	  private int basic; 
	  private int total; 
	  private int need; 
	  private int prot;
	  private int fat; 
	  private int cab;
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getNeed() {
		return need;
	}
	public void setNeed(int need) {
		this.need = need;
	}
	public int getProt() {
		return prot;
	}
	public void setProt(int prot) {
		this.prot = prot;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getCab() {
		return cab;
	}
	public void setCab(int cab) {
		this.cab = cab;
	} 
}
