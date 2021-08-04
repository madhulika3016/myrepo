package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Coder;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello()
	{
		System.out.println("Welcome to Spring Controller");
		
		return "Welcome to Spring Controller";
	}
	
	@RequestMapping("/getCoder")
	@ResponseBody
	public Coder getCoder()
	{
		Coder c1=new Coder();
		c1.setCid(101);
		c1.setCname("Dia");
		c1.setTech("Java");
		System.out.println(c1.hashCode());
		System.out.println(c1.toString());
		
		return c1;
	}
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		System.out.println("Welcome to My Web Page....HTML");
		
		return "welcome.html";
	}


}
