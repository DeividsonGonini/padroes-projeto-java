package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory iPhoneFactory = new IPhoneFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iPhoneFactory.orderIPhone("X", "padrao");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone XS Max");
		IPhone iphone2 = iPhoneFactory.orderIPhone("X", "top");
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone3 = iPhoneFactory.orderIPhone("11", "padrao");
		System.out.println(iphone3);

		System.out.println("\n\n### Ordering an iPhone 11 PRO");
		IPhone iphone4 = iPhoneFactory.orderIPhone("11", "top");
		System.out.println(iphone4);
	}
}
