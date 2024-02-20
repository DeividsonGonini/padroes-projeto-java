package br.com.cod3r.factory.apple.factoryMethod.factory;

import br.com.cod3r.factory.apple.factoryMethod.model.IPhone;
import br.com.cod3r.factory.apple.factoryMethod.model.IPhone11Pro;

public class Iphone11ProFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
