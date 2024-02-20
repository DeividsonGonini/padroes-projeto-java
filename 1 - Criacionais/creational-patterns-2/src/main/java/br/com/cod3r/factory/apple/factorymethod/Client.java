package br.com.cod3r.factory.apple.factorymethod;

import br.com.cod3r.factory.apple.factorymethod.factory.*;
import br.com.cod3r.factory.apple.factorymethod.model.IPhone;
import br.com.cod3r.factory.apple.simple.model.IPhoneXSMax;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory iPhoneXSMaxFactory = new IPhoneXSMaxFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory();
		IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();


		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = iPhoneXFactory.orderIphone();
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone XS MAX");
		IPhone iPhone2 = iPhoneXSMaxFactory.orderIphone();
		System.out.println(iPhone2);


		System.out.println("\n\n### Ordering an iPhone 11 Padrao");
		IPhone iPhone3 = iPhone11Factory.orderIphone();
		System.out.println(iPhone3);


		System.out.println("\n\n### Ordering an iPhone 11 PRO");
		IPhone iPhone4 = iPhone11ProFactory.orderIphone();
		System.out.println(iPhone4);

	}
}
