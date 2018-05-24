package aop6;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;

public class LogAdvisor implements PointcutAdvisor {
	
	private Advice advice;
	private Pointcut pointcut;

	public Pointcut getPointcut() {
		return pointcut;
	}

	public Advice getAdvice() {
		return advice;
	}

	public boolean isPerInstance() {
		return false;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

	public void setPointcut(Pointcut pointcut) {
		this.pointcut = pointcut;
	}

}
