package aop6;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;


//自定义切入点
public class MyPointcut implements Pointcut {

	public ClassFilter getClassFilter() {
		return new ClassFilter(){

			public boolean matches(Class clazz) {
				return SomeServiceImpl.class.equals(clazz);
			}
			
		};
	}

	public MethodMatcher getMethodMatcher() {
		return new MethodMatcher(){

			public boolean isRuntime() {
				return false;
			}

			public boolean matches(Method method, Class targetClass) {
				return "doOther".equals(method.getName());
			}

			public boolean matches(Method method, Class targetClass, Object[] args) {
				return false;
			}
			
		};
	}

}
