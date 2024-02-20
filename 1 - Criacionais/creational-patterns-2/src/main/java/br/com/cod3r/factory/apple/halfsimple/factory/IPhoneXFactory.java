package br.com.cod3r.factory.apple.halfsimple.factory;

import br.com.cod3r.factory.apple.halfsimple.model.IPhone;
import br.com.cod3r.factory.apple.halfsimple.model.IPhoneX;
import br.com.cod3r.factory.apple.halfsimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{
    @Override
    public IPhone createIphone(String modelo) {
        if("padrao".equals(modelo)){
            return new IPhoneX();
        }else if("top".equals(modelo)){
            return new IPhoneXSMax();
        }else return null;

    }
}
