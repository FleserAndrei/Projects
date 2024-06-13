package p1;
import java.util.regex.*;
public class ValidationClass {

    public ValidationClass() {

    }

    private static boolean validateRegex(String stringToValidate, String regexExpression){

        return Pattern.compile(regexExpression).matcher(stringToValidate).matches();
    }

    public  static boolean validateEmail(String emailAddress){

        String emailRegex = "^[a-zA-Z\\.0-9_\\-]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}$";

        return validateRegex(emailAddress, emailRegex);
    }
    public  static boolean validatePassword(String password){

        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{10,}$";

        return validateRegex(password, passwordRegex);
    }
    public  static boolean validatePhoneNumber(String phoneNumber){

        String phoneNumberRegex = "^(\\+|00)[0-9]{11}$";   //(+[0-9]{2}|[0-9]{4})[0-9]{9}$";

        return validateRegex(phoneNumber, phoneNumberRegex);
    }
}
