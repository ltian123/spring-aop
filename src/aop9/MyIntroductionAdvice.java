package aop9;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

public class MyIntroductionAdvice implements IntroductionInterceptor,IOtherService {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Method method=invocation.getMethod();
		
		//获得方法所在的类型
		Class c=method.getDeclaringClass();
		
		//判断是否是引入的方法
		if(implementsInterface(c)){
			//调用引入的方法
			return method.invoke(this, invocation.getArguments());
		}
		//调用目标方法
		return invocation.proceed();
	}

	//判断intf是否是引入类型
	public boolean implementsInterface(Class intf) {
		return IOtherService.class.isAssignableFrom(intf);
	}

	public void doOther() {
		System.out.println("MyIntroductionAdvice.doOther()");
	}

}
