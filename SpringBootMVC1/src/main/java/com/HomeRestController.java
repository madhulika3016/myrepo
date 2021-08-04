package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Coder;
import com.service.CoderServiceImpl;

@RestController
public class HomeRestController {
	
	@Autowired
	CoderServiceImpl coderservice;
	
	@RequestMapping("/helloRest")
	public String hello()
	{
		System.out.println("Welcome to Spring Rest Controller");
		
		return "Welcome to Spring Rest Controller";
	}
	
	@GetMapping("/getCoder1")
	public List<Coder> getCoder()
	{
		List<Coder> lc1=coderservice.getCoders();
		return lc1;
	}
	
	@GetMapping("/getCoder1/{cid}")
	public Coder getCoderById(@PathVariable int cid)
	{
	 Coder c1=coderservice.getCoderById(cid);
		return c1;
	}
	
	@PostMapping(path="/addCoder1")
	public List<Coder> addCoder(@RequestBody  Coder coder)
	{
		List<Coder> lc1=coderservice.addCoder(coder);
		for(Coder c1:lc1)
		{
			System.out.println(c1);
		}
		return lc1;
	}
	
	@PutMapping(path="/updateCoder1")
	public List<Coder> updateCoder(@RequestBody  Coder coder)
	{
		List<Coder> lc1=coderservice.updateCoder(coder);
		for(Coder c1:lc1)
		{
			System.out.println(c1);
		}
		return lc1;
	}
	
	@DeleteMapping(path="/deleteCoder1")
	public String deleteCoder(@RequestBody  Coder coder)
	{
		String msg=coderservice.deleteCoder(coder);
		System.out.println(coder);
		return msg;
	}	
}
