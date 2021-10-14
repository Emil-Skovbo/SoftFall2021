package com.example.activemq;

import org.apache.camel.Exchange;
import org.apache.logging.log4j.util.StringBuilders;
import org.springframework.stereotype.Component;
import org.apache.camel.Processor;


@Component
public class Case3MyProcessor implements Processor {

    public void process(Exchange ex){
        String iget = ex.getIn().getBody(String.class);
        StringBuilder nsb = new StringBuilder();
        nsb.append(iget.trim());
        nsb.append(",");
        nsb.append("nok");
        //ex.getIn().set

    }
}
