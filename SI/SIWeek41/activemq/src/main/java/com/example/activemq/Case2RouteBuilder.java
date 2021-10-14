package com.example.activemq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Case2RouteBuilder extends RouteBuilder {

    @Override
    public void configure(){
      from("timer:active-mq-timer?period=1000").
                transform().constant("\n 🍆💦💦<br>")
                .log("$(body)")
                .to("activemq:just:queue");

        from("activemq:just:queue")
               .to("file:src/main/resources/filedump?fileExist=Append&?filename=text.txt")
        //.end()
        ;

    }

}
