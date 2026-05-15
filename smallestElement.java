public class smallestElement {
    public class SmallestElement {

        public static void main(String[] args) {

            int[] arr = { 45, 12, 89, 3, 55 };

            int min = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] < min) {

                    min = arr[i];
                }
            }

            System.out.println(
                    "Smallest Element = "
                            + min);
        }
    }
}
