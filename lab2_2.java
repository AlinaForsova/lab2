import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class lab2_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль: ");
            if (in.hasNextLine()) {
                String password = in.nextLine();
                String pattern = "((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[0-9a-zA-Z_]{8,})";
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(password);
                if ((m.matches())) {
                    System.out.println("Пароль надёжный");
                    System.exit(0);
                } else {
                    System.out.println("Пароль ненадёжный");

                }
            }
        }
    }

