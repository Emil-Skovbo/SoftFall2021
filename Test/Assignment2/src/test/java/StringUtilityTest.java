import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityTest {


    StringUtility line = new StringUtility();

    @ParameterizedTest
    @ValueSource(strings = {"aBc"})
    public void ReverseStringTest(String input){
        assertEquals("cBa",StringUtility.ReverseString(input));
    }

    @ParameterizedTest
    @NullAndEmptySource()
    public void ReverseStringNotNullorEmptyTest(String input){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            line.ReverseString(input);
        });
        String expectedMessage = "String cant be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @ParameterizedTest
    @ValueSource(strings = {"aBc"})
    public void CapitalizeStringTest(String input){
        assertEquals("ABC",StringUtility.CapitalizeString(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aBc"})
    public void LowercaseStringTest(String input){
        assertEquals("abc",StringUtility.LowercaseString(input));
    }


}
