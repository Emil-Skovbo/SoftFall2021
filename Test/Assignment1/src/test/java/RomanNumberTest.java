import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    public void RomanNumberTest(){
        RomanNumber rn = new RomanNumber();
        assertEquals("I",rn.toRoman(1));
        assertEquals("C",rn.toRoman(100));
        assertEquals("M",rn.toRoman(1000));
        assertEquals("X",rn.toRoman(10));
    }
}
