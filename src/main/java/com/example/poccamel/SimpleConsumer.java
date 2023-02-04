package com.example.poccamel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleConsumer extends RouteBuilder {

    @Autowired
    private ProcessarMensagem processarMensagem;


    @Override
    public void configure() throws Exception {

        /*
             De:

                mensagem...

             Para:
         */


        from("kafka:topico_xpto?brokers=127.0.0.1:9092&groupId=camel_consumer")
                .autoStartup(true)
//                .tracing()
//                .log(">>> ${headers[kafka.TOPIC]}")
                .process(exchange -> {
//                    KafkaManualCommit manual = exchange.getIn().getHeader(KafkaConstants.OFFSET, KafkaManualCommit.class);
//                    if (manual != null) {
//                        manual.commit();
//                    }
                    exchange.getIn().setBody(this.processarMensagem.executar(exchange.getIn().getBody(SimplePojo.class)));
                })
//                .to("kafka:topico_destino?brokers=127.0.0.1:9092")
                .end();

//        from("kafka:topico_xpto?brokers=localhost:9092")
//                .process(processar(body()));
    }
}
