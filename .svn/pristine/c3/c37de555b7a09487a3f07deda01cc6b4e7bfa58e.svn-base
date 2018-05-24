package aop9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"aop9/applicationContext.xml");
		
		ISomeService someService=(ISomeService) ac.getBean("someService");
		
		someService.doSome();
		
		((IOtherService)someService).doOther();
	}
}
