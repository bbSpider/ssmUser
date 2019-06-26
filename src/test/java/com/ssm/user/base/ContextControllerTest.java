package com.ssm.user.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@ContextConfiguration({ "classpath:spring/spring-web.xml", "classpath:spring/spring-service.xml",
		"classpath:spring/spring-dao.xml" })
public class ContextControllerTest {

	@Autowired
	protected WebApplicationContext wac;
}