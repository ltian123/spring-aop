package aop10;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimeAdvice {
	public Object time(ProceedingJoinPoint jp)throws Throwable {
		Object target=jp.getThis();
		String methodName=jp.getSignature().getName();
		Object[] args=jp.getArgs();
		
		
		Object result=null;
		long start=0;
		long end=0;
		
		try {
			System.out.println("开始");
			start=System.currentTimeMillis();
			
			result=jp.proceed();
			
			end=System.currentTimeMillis();
			System.out.println("结束");
			System.out.println(methodName+" "+(end-start));
		} catch (Exception e) {
			end=System.currentTimeMillis();
			System.out.println("出错");
			System.out.println(methodName+" "+(end-start));
			throw e;
		}
		
		return result;
		
		
		
	}
}
