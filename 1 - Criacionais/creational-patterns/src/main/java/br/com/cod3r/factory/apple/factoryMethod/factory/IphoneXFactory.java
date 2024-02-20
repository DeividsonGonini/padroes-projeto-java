package br.com.cod3r.factory.apple.factoryMethod.factory;

import br.com.cod3r.factory.apple.factoryMethod.model.IPhone;
import br.com.cod3r.factory.apple.factoryMethod.model.IPhoneX;

public class IphoneXFactory extends IPhoneFactory{
        @Override
        public IPhone createIPhone() {
        return new IPhoneX();
    }
}
