public class Demo2 {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box("Bhoomika");
        Box b3 = new Box(true);

        System.out.println(b1.getValue() + 5); /*
                                                * Because getValue() returns an Object, not an Integer.
                                                * 
                                                * Your code:
                                                * 
                                                * System.out.println(b1.getValue() + 5);
                                                * 
                                                * becomes internally:
                                                * 
                                                * Object + int
                                                * 
                                                * And Java does NOT know how to add:
                                                * 
                                                * Object + int
                                                * 
                                                * So compiler gives error.
                                                */
    }
}

class Box {
    private Object value;

    Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}