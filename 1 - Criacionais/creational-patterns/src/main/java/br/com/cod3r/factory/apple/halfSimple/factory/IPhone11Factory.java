package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone11;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IphoneFactory {


    @Override
    public IPhone createIPhone(String modelo) {

        if("padrao".equals(modelo)){
            return new IPhone11();
        }else if("top".equals(modelo)){
            return new IPhone11Pro();
        }else return  null;

    }
}
