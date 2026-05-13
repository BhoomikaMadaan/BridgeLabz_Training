package BridgeLabz_Training;

import java.util.Scanner;

public class String_Compression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(String_compression(s));
    }

    public static String String_compression(String s) {

        String ans = "";

        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {

                count++;
            } else {

                ans += s.charAt(i) + "" + count;

                count = 1;
            }
        }

        ans += s.charAt(s.length() - 1) + "" + count;

        return ans;
    }
}