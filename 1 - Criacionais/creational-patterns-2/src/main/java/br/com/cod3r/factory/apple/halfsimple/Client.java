package br.com.cod3r.factory.apple.halfsimple;

import br.com.cod3r.factory.apple.halfsimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfsimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfsimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfsimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory iphoneXfactory = new IPhoneXFactory();
		IPhoneFactory iphone11factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = iphoneXfactory.orderIPhone("padrao");
		System.out.println(iPhone);


		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = iphone11factory.orderIPhone("top");
		System.out.println(iPhone2
		);
	}
}
