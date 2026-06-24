import java.util.*;

public class GenericSwap {
    public static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
        swap(list, 0, 2);
        System.out.println(list);

        List<String> names = new ArrayList<>(Arrays.asList("Ram", "Shyam", "Mohan"));
        swap(names, 0, 2);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A"));
        employees.add(new Employee("B"));
        employees.add(new Employee("C"));
    }
}
