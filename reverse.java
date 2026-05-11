package BridgeLabz_Training;

import java.util.*;

public class reverse {

    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("hello");
        // sb.reverse();
        // System.out.println(sb);

        String s = "hello";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);

        }
        System.out.println(rev);

    }

}