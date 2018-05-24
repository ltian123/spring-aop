package aop5;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MethodCacheAdvice implements MethodInterceptor {

	private static Map<Key,Object> cache=new HashMap<Key,Object>();
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object target=invocation.getThis();
		Method method=invocation.getMethod();
		Object[] args=invocation.getArguments();
		
		Key key=new Key(target,method,args);
		
		Object result=cache.get(key);
		
		if(result==null){
			result=invocation.proceed();
			cache.put(key, result);
		}
		
		return result;
	}
	
	private static class Key{
		private Object target;
		private Method method;
		private Object[] args;
		public Key(Object target, Method method, Object[] args) {
			super();
			this.target = target;
			this.method = method;
			this.args = args;
		}
		@Override
		public int hashCode() {
			final int PRIME = 31;
			int result = 1;
			result = PRIME * result + Arrays.hashCode(args);
			result = PRIME * result + ((method == null) ? 0 : method.hashCode());
			result = PRIME * result + ((target == null) ? 0 : target.hashCode());
			return result;
//			return 1;
//			return (int) (Math.random()*100000);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final Key other = (Key) obj;
			if (!Arrays.equals(args, other.args))
				return false;
			if (method == null) {
				if (other.method != null)
					return false;
			} else if (!method.equals(other.method))
				return false;
			if (target == null) {
				if (other.target != null)
					return false;
			} else if (!target.equals(other.target))
				return false;
			return true;
		}
		
		
	}

}
