package BridgeLabz_Training;

import java.util.*;

public class anagram_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2)) {
            System.out.println("Anagram confirmed");
        } else {
            System.out.println("not an anagram");
        }

    }

    public static boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            return true;
        }
        return false;
    }

}
