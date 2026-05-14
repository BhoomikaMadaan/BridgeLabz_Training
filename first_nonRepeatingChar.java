import java.util.Scanner;

public class first_nonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        non_repeating_char(s);

    }

    public static void non_repeating_char(String s) {

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println(ch);
            }
        }
    }
}
