package com.example.poccamel;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

@Component
public class ProcessarMensagem {

    public SimplePojo executar(SimplePojo body){
        SimplePojo sp = new SimplePojo();
        sp.setKey(new Random().nextInt(1000, 99999999));
        sp.setTimestamp(LocalDateTime.now());
        sp.setCorrelationid(UUID.randomUUID().toString());
        return sp;

    }

}
