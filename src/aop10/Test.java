package aop10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"aop10/applicationContext.xml");
		
		ISomeService someService=(ISomeService) ac.getBean("someService");
		IOtherService otherService=(IOtherService) ac.getBean("otherService");
		
		someService.doSome();
		System.out.println();
		someService.doOther();
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		try {
			otherService.doSome();
		} catch (SomeException e) {
			System.out.println("main "+e);
		}
		System.out.println();
		String r=otherService.doOther("abc");
		System.out.println("main "+r);
		
		
	}
}
