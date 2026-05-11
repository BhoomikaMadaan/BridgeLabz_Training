package BridgeLabz_Training;

import java.util.Scanner;

public class count_occurences {

    public int count_occurences(String str, char target) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String str = sc.nextLine();

        System.out.print("Enter Character: ");

        char target = sc.next().charAt(0);

        count_occurences obj = new count_occurences();

        int result = obj.count_occurences(str, target);

        System.out.println("Frequency = " + result);
    }
}