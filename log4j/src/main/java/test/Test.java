package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxl = new ClassPathXmlApplicationContext("connect.xml");
		Log4j lo = (Log4j)cpxl.getBean("log4j");
		lo.testLog4j();
	}

}
