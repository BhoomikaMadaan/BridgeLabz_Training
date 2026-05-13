package BridgeLabz_Training;

import java.util.*;

public class reverse_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count_words(s);
    }

    public static void count_words(String s) {
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
    }
}
