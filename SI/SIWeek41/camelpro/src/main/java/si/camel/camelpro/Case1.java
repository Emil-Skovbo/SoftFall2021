package si.camel.camelpro;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Case1 extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("stream:in?promptMessage=Type in:")
        .choice()
        .when(bodyAs(String.class).contains("Camel"))
            .to("file:src/main/resources/yescamel")
        .otherwise()
            .to("file:src/main/resources/nocamel")
        .end();
    }
}
