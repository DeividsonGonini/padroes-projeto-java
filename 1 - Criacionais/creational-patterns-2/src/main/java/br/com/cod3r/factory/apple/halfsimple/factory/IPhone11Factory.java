package br.com.cod3r.factory.apple.halfsimple.factory;

import br.com.cod3r.factory.apple.halfsimple.model.IPhone;
import br.com.cod3r.factory.apple.halfsimple.model.IPhone11;
import br.com.cod3r.factory.apple.halfsimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory{
    @Override
    protected IPhone createIphone(String modelo) {
        if("padrao".equals(modelo)){
            return new IPhone11();
        }else if("top".equals(modelo)){
            return new IPhone11Pro();
        }else return null;
    }
}
