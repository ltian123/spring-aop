package aop4;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

//异常通知
public class ServiceExceptionAdvice implements ThrowsAdvice {
//	public void afterThrowing(Exception ex){
//		System.out.println("exception");
//	}
//	
//	public void afterThrowing(SomeException ex){
//		System.out.println("some exception");
//	}
//	
//	public void afterThrowing(OtherException ex){
//		System.out.println("other exception");
//	}
	
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
		System.out.println(target.getClass().getName()+"类"+method.getName()+"方法抛出"+ex+"异常");
	}
}







