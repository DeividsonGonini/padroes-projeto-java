package br.com.cod3r.factory.apple.factoryMethod.factory;

import br.com.cod3r.factory.apple.factoryMethod.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(){
    IPhone device = null;

   device = createIPhone();

    device.assemble();
    device.certificates();
    device.pack();
    device.getHardware();

    return device;
    };

    protected abstract IPhone createIPhone();
}
