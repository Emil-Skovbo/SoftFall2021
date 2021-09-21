import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrenheitTest {
    @Test
    public void FahrenheitToCelciusConverterTest(){
        Fahrenheit f = new Fahrenheit();
        assertEquals(0,f.convert(32));
        assertEquals(10,f.convert(50));
        assertEquals(70,f.convert(158));

    }
}
