package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.simple.model.*;

public class IphoneSimpleFactory {

    public static IPhone orderIphone(String geracao, String modelo){
        IPhone device = null;

        if("X".equals(geracao)){
            if("padrao".equals(modelo)){
                device = new IPhoneX();
            }else if("top".equals(modelo)){
                device = new IPhoneXSMax();
            }
        }else if ("11".equals(geracao)){
            if("padrao".equals(modelo)){
                device = new IPhone11();
            }else if("top".equals(modelo)){
                device = new IPhone11Pro();
            }
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
}
