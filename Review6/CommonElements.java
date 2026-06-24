import java.util.*;

public class CommonElements {

    public static void Main(String[] args) {

        int[] A = { 1, 2, 2, 3, 4 };
        int[] B = { 2, 2, 4, 5 };

        Set<Integer> A = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : A) {
            A.add(num);
        }

        for (int num : B) {
            if (A.contains(num))
                result.add(num);
        }
        System.out.println(result);
    }
}
