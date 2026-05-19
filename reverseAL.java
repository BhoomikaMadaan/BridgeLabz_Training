import java.util.*;

public class reverseAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int start = 0;
        int end = arr.size() - 1;

        while (start < end) {
            int temp = arr.get(start);

            arr.set(start, arr.get(end));

            arr.set(end, temp);

            start++;
            end--;
        }

        System.out.println(arr);

    }
}
