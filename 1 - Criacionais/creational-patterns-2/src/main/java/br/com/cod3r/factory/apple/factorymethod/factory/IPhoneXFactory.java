package br.com.cod3r.factory.apple.factorymethod.factory;

import br.com.cod3r.factory.apple.factorymethod.model.IPhone;
import br.com.cod3r.factory.apple.factorymethod.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{

    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
