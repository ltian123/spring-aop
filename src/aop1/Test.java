package aop1;

//静态代理模式
public class Test {
	public static void main(String[] args) {
		ISomeService someService=new SomeServiceProxy();
		
		someService.doSome();
		someService.doOther();
	}
}
