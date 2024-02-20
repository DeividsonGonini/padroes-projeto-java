package br.com.cod3r.factory.apple.halfsimple.factory;

import br.com.cod3r.factory.apple.halfsimple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(String modelo){
        IPhone aparelho = null;

        aparelho = createIphone(modelo);

        aparelho.assemble();
        aparelho.certificates();
        aparelho.pack();
        aparelho.getHardware();

        return aparelho;
    }


    protected abstract IPhone createIphone(String modelo);
}
