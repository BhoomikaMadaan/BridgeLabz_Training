import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        System.out.println(n == 1);
    }
}
