public class EmployeeOOPS {
    interface IDepartment {
        void assignDepartment(String dept);

        void getDepartmentDetails();
    }

    // Abstract class
    abstract class Employee {

        private int employeeId;
        private String name;
        private double baseSalary;

        // Constructor
        Employee(int employeeId, String name, double baseSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.baseSalary = baseSalary;
        }

        // Getters
        public int getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        // Abstract method
        abstract double calculateSalary();

        // Concrete method
        void displayDetails() {
            System.out.println("ID: " + employeeId);
            System.out.println("Name: " + name);
        }
    }

    // Full Time Employee
    class FullTimeEmployee extends Employee implements IDepartment {

        private String department;

        FullTimeEmployee(int id, String name, double salary) {
            super(id, name, salary);
        }

        @Override
        double calculateSalary() {
            return getBaseSalary();
        }

        @Override
        public void assignDepartment(String dept) {
            department = dept;
        }

        @Override
        public void getDepartmentDetails() {
            System.out.println("Department: " + department);
        }
    }

    // Part Time Employee
    class PartTimeEmployee extends Employee implements IDepartment {

        private int hours;
        private String department;

        PartTimeEmployee(int id, String name, double salary, int hours) {
            super(id, name, salary);
            this.hours = hours;
        }

        @Override
        double calculateSalary() {
            return getBaseSalary() * hours;
        }

        @Override
        public void assignDepartment(String dept) {
            department = dept;
        }

        @Override
        public void getDepartmentDetails() {
            System.out.println("Department: " + department);
        }
    }

    // Main class
    public class Main {

        public static void main(String[] args) {

            Employee e1 = new FullTimeEmployee(101, "Rahul", 50000);

            Employee e2 = new PartTimeEmployee(102, "Aman", 500, 8);

            ((IDepartment) e1).assignDepartment("IT");
            ((IDepartment) e2).assignDepartment("HR");

            Employee[] employees = { e1, e2 };

            for (Employee e : employees) {

                e.displayDetails();

                System.out.println("Salary: " + e.calculateSalary());

                ((IDepartment) e).getDepartmentDetails();

                System.out.println();
            }
        }
    }

}
