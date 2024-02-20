package br.com.cod3r.factory.apple.factoryMethod.factory;

import br.com.cod3r.factory.apple.factoryMethod.model.IPhone;
import br.com.cod3r.factory.apple.factoryMethod.model.IPhoneXSMax;

public class IphoneXSMaxFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
