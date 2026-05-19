import java.util.*;

public class mergeArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> li1 = new ArrayList<>();// first list

        ArrayList<Integer> li2 = new ArrayList<>();// SECOND ARRAYLIST

        // input for the first arraylist
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            li1.add(sc.nextInt());
        }

        // imput for the list 2;
        int n2 = sc.nextInt();

        for (int j = 0; j < n2; j++) {
            li2.add(sc.nextInt());
        }

        // li1.addAll(li2); // merging both the lists using addAll()

        for (int k = 0; k < n2; k++) {
            li1.add(li2.get(k));

        }
        System.out.println(li1);

    }

}