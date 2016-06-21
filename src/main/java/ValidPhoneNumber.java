import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        return Pattern.compile("^\\(\\d{3}\\) \\d{3}-\\d{4}$").matcher(phoneNumber).find();
    }
}
