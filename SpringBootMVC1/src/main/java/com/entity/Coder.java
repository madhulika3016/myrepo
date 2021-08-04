package com.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Coder {
	
	private int cid;
	private String cname;
	private String tech;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Coder [cid=" + cid + ", cname=" + cname + ", tech=" + tech + "]";
	}
	
}
	

