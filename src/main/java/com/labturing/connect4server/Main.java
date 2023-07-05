package com.labturing.connect4server;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // TODO execute some code after the initialization of the application
        System.out.println("CODIGO DESPUES DE METODO PRINCIPAL ");
    }
    
}
