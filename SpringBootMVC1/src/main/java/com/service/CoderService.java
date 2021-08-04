package com.service;

import java.util.List;

import com.entity.Coder;

public interface CoderService {
	
	public List<Coder> getCoders();
	
	public Coder getCoderById(int id);
	
	public List<Coder> addCoder(Coder coder);

}
