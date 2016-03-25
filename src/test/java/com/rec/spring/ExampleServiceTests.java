package com.rec.spring;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ExampleServiceTests {

	private static final String HELLO_WORLD = "hello world";

	private ApplicationContext context;

	@Before
	public void setUp() {
		System.setProperty("title", "hello world");

		context = new AnnotationConfigApplicationContext(AppConfig.class);
	}

	@After
	public void tearDown() {
		((AbstractApplicationContext) context).close();
	}

	@Test
	public void getBean() {
		Disc bean = context.getBean(Disc.class);
		assertEquals(HELLO_WORLD, bean.getTitle());
	}

}
