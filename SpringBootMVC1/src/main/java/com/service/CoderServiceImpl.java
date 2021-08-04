package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Coder;

@Service
public class CoderServiceImpl implements CoderService
{

	List<Coder> lc=new ArrayList<Coder>();
	Coder c1,c2,c3;
	
	public CoderServiceImpl()
	{
		 c1=new Coder();
		c1.setCid(101);
		c1.setCname("Dia");
		c1.setTech("Java");
		
		 c2=new Coder();
		c2.setCid(102);
		c2.setCname("Diana");
		c2.setTech("JavaFS");
		
		 c3=new Coder();
		c3.setCid(103);
		c3.setCname("Tia");
		c3.setTech("AI");
		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
		
	}
	public List<Coder> getCoders() {

		return lc;
	}

	@Override
	public Coder getCoderById(int cid) {
		Coder c=null;
		int id=0;
		for(int i=0;i<lc.size();i++)
		{
		id=lc.get(i).getCid();
		if(id==cid)
		{
		 c=lc.get(i);
		 //return c;
		}
		}
		return c;
	}

	@Override
	public List<Coder> addCoder(Coder coder) {
		lc.add(coder);
		return lc;
	}
	public List<Coder> updateCoder(Coder coder) {
		int id=0;
		for(int i=0;i<lc.size();i++)
		{
		id=lc.get(i).getCid();
		if(id==coder.getCid())
		{
		lc.set(i, coder);
		 return lc;
		}
		}
		return lc;
	}
	
	public String deleteCoder(Coder coder) {
		System.out.println(lc.remove(coder));
		return "Deleted";
	}
	

}
