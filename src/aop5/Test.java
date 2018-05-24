package aop5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"aop5/applicationContext.xml");
		
		ISomeService someService=(ISomeService) ac.getBean("someService");
		
		System.out.println(someService.doSome(6));
		System.out.println(someService.doSome(6));
		System.out.println(someService.doSome(6));
		System.out.println(someService.doSome(6));
		System.out.println(someService.doSome(6));
		System.out.println(someService.doSome(6));
		System.out.println(someService.doSome(6));
		
		System.out.println(someService.doSome(8));
		System.out.println(someService.doSome(8));	
		
		System.out.println(someService.doOther(6));
		System.out.println(someService.doOther(6));
		
		IOtherService otherService=(IOtherService) ac.getBean("otherService");
		System.out.println(otherService.doSome(6));
		System.out.println(otherService.doSome(6));
		
		
	}
}
