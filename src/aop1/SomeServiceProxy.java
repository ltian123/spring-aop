package aop1;

import java.util.Date;

//代理类
public class SomeServiceProxy implements ISomeService {

	private ISomeService someService;
	
	public SomeServiceProxy() {
		someService=new SomeServiceImpl();
	}
	
	public void doOther() {
		System.out.println("doOther execute at:"+new Date());
		someService.doOther();
	}

	public void doSome() {
		System.out.println("doSome execute at:"+new Date());
		someService.doSome();
	}

}
