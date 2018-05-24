package aop4;

import java.util.Scanner;

public class SomeServiceImpl implements ISomeService {

	public void doSome() throws SomeException, OtherException {
		System.out.println("SomeServiceImpl.doSome()");
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		
		if(i==1){
			throw new SomeException();
		}
		
		if(i==2){
			throw new OtherException();
		}
	}

}
