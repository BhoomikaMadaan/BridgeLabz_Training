package BridgeLabz_Training;

import java.util.*;

public class count_vowels {

    public static int count_Vowels(String s) {

        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(count_Vowels(str));
    }

}
