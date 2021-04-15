package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public MessageBean messageBean()
	{
		MessageBean mb= new MessageBean();
		mb.setMessage("Hello How are you?");
		return mb;
	}
	
	@Bean
	public HelloBean hello()
	{
		HelloBean h=new HelloBean();
		h.setName("Viswadeep Roy Chaudhary");
		return h;
	}

}
