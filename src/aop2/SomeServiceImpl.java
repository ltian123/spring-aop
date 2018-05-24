package aop2;

public class SomeServiceImpl implements ISomeService {

	public void doOther() {
		System.out.println("SomeServiceImpl.doOther()");
	}

	public void doSome() {
		System.out.println("SomeServiceImpl.doSome()");
	}

	public void f() {
		System.out.println("SomeServiceImpl.f()");
	}

}
