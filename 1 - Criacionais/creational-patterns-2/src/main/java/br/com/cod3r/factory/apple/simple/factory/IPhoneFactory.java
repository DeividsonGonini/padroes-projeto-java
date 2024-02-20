package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.simple.model.*;

public class IPhoneFactory {

    public IPhone orderIPhone (String geracao, String modelo) {
        IPhone aparelho = null;

        if ("X".equals(geracao)) {
            if ("padrao".equals(modelo)) {
                aparelho = new IPhoneX();
            } else if ("top".equals(modelo)) {
                aparelho = new IPhoneXSMax();
            }
        } else if ("11".equals(geracao)) {
            if ("padrao".equals(modelo)) {
                aparelho = new IPhone11();
            } else if ("top".equals(modelo)) {
                aparelho = new IPhone11Pro();
            }
        } else aparelho = null;

        aparelho.getHardware();
        aparelho.certificates();
        aparelho.assemble();
        aparelho.pack();

    return aparelho;

    };

	
}
