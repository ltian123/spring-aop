package aop10;

import org.aspectj.lang.JoinPoint;

public class Log {
	public void before(JoinPoint jp){
		Object[] args=jp.getArgs();
		String methodName=jp.getSignature().getName();
		System.out.println("----方法"+methodName+"即将执行，参数个数："+args.length);
	}
	
	public void afterReturning(JoinPoint jp,Object r){
		String methodName=jp.getSignature().getName();
		System.out.println("----方法"+methodName+"已经返回，返回值是："+r);
	}
	
	public void afterThrowing(JoinPoint jp,Exception e){
		String methodName=jp.getSignature().getName();
		System.out.println("----方法"+methodName+"已经出错，异常对象是："+e);
	}
}
