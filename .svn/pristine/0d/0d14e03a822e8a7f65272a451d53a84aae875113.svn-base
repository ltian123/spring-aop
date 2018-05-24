package aop8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"aop8/applicationContext.xml");
		
		ISomeService someService=(ISomeService) ac.getBean("someService");
		IOtherService otherService=(IOtherService) ac.getBean("otherService");
		
		someService.doSome();
		someService.doOther();
		otherService.doOther();
	}
}
