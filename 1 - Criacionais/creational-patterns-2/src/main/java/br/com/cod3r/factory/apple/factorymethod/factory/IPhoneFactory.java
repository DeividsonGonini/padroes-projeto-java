package br.com.cod3r.factory.apple.factorymethod.factory;

import br.com.cod3r.factory.apple.factorymethod.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone(){
        IPhone aparelho = null;

        aparelho = createIPhone();

        aparelho.getHardware();
        aparelho.assemble();
        aparelho.certificates();
        aparelho.pack();

        return aparelho;
    }

	protected abstract IPhone createIPhone();
}
