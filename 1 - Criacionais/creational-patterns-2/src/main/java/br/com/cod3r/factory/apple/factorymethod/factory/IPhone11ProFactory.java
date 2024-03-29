package br.com.cod3r.factory.apple.factorymethod.factory;

import br.com.cod3r.factory.apple.factorymethod.model.IPhone;
import br.com.cod3r.factory.apple.factorymethod.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
