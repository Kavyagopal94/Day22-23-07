import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        // Sample email addresses for testing
        String[] emails = {
                "test.email@gmail.com",
                "test.email+regex@gmail.com",
                "test.email@sub.domain.com",
                "invalid-email@.com",
                "another.test@domain.co.uk",
                "ESXcvbnm"
        };

        // Regex pattern for email validation
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(emailPattern);

        // Validate each email
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is not a valid email address.");
            }
        }
    }
}
