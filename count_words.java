import java.util.*;

public class count_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count_Words(s);

    }

    public static void count_Words(String s) {

        String[] words = s.split(" ");
        System.out.println(words.length);

    }
}
