import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap dia chi email: ");
        String email = input.nextLine().trim();

        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+(\\.[a-zA-Z]{2,6})+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean isMatch = matcher.matches();
        if (isMatch) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        input.close();
    }
}
