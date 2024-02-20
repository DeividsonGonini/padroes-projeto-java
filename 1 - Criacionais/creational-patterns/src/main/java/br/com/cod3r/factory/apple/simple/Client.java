package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IphoneSimpleFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X padrao");
		IPhone iPhone = IphoneSimpleFactory.orderIphone("X", "padrao");
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone 11 TOP");
		IPhone iphone2 = IphoneSimpleFactory.orderIphone("11", "top");
		System.out.println(iphone2);


		System.out.println("\n\n### Ordering an iPhone X top");
		IPhone iPhone3 = IphoneSimpleFactory.orderIphone("X", "top");
		System.out.println(iPhone3);

	}
}
