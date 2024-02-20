package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public abstract class IphoneFactory {

//    geração
    public IPhone orderIphone(String modelo)
    {
        IPhone device = null;

        device = createIPhone(modelo);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    };


//    modelo
    protected abstract IPhone createIPhone(String modelo);
}
