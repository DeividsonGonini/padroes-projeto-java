package br.com.cod3r.factory.apple.factoryMethod.factory;

import br.com.cod3r.factory.apple.factoryMethod.model.IPhone;
import br.com.cod3r.factory.apple.factoryMethod.model.IPhone11;

public class Iphone11Factory extends IPhoneFactory{
    @Override
    public IPhone createIPhone() {
        return new IPhone11();
    }
}
