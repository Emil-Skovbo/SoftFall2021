import java.util.Locale;

public class StringUtility {

    public static String ReverseString(String str) {
        if (str == null || str.isBlank()){
            throw new IllegalArgumentException("String cant be null or empty");
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }

    public static String CapitalizeString(String input) {
        return input.toUpperCase(Locale.ROOT);
    }

    public static String LowercaseString(String input) {
        return input.toLowerCase(Locale.ROOT);
    }
}
