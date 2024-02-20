package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

import java.util.Arrays;


public class Client {
	
	public static void main(String[] args) {

		String rule = "us";
		CountryRulesAbstractFactory rules = null;


		if(rule.equals("brazil")) {
			rules = new BrazilianRulesAbstractFactory();
		}if (rule.equals("us")) {
		rules = new USRulesAbstractFactory();
		}

		IPhoneFactory iphoneX = new IPhoneXFactory(rules);
		IPhoneFactory iphone11 = new IPhone11Factory(rules);

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneX.orderIPhone("standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
