package BridgeLabz_Training;

import java.util.*;

public class count_words {
    public static int count_Words(String s) {
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(count_Words(str));

    }
}
