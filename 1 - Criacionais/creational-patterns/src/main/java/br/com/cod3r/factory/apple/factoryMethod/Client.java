package br.com.cod3r.factory.apple.factoryMethod;

import br.com.cod3r.factory.apple.factoryMethod.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factoryMethod.factory.Iphone11ProFactory;
import br.com.cod3r.factory.apple.factoryMethod.factory.IphoneXFactory;
import br.com.cod3r.factory.apple.factoryMethod.model.IPhone;
import br.com.cod3r.factory.apple.factoryMethod.model.IPhone11Pro;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory iphoneXFactory = new IphoneXFactory();
		IPhoneFactory iphone11ProFactory = new Iphone11ProFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = iphoneXFactory.orderIPhone();
		System.out.println(iPhone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iPhone2);
	}
}
