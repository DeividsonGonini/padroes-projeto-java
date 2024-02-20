package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;
import br.com.cod3r.factory.apple.halfSimple.model.IPhoneX;
import br.com.cod3r.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IphoneFactory {


    @Override
    public IPhone createIPhone(String modelo) {

        if("padrao".equals(modelo)){
            return new IPhoneX();
        }else if("top".equals(modelo)){
            return new IPhoneXSMax();
        }else return null;
    }
}
