public class ObjectDifferentiationExample {
    public static void main(String[] args) {
        // Create objects of different types
        String str = "Hello";
        Integer num = Integer.valueOf(123); // Convert int to Integer using Integer.valueOf()
        Object obj = new Object();
        int[] array = {1, 2, 3};

        // Differentiate and display the types of objects
        System.out.println("str is a String: " + (str instanceof String));
        System.out.println("num is an Integer: " + (num instanceof Integer));
        System.out.println("obj is an Object: " + (obj instanceof Object));
        System.out.println("array is an int array: " + (array instanceof int[]));

        // Additional check for superclass and subclass
        System.out.println("num is a Number: " + (num instanceof Number));
        System.out.println("obj is a String: " + (obj instanceof String)); // This will be false
    }
}
