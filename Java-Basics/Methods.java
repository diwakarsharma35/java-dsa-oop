public class Methods {

    // Method with no parameters
    static void greet() {
        System.out.println("Hello from Java Methods!");
    }

    // Method with parameters
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method that returns a value
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        greet();

        greetUser("Diwakar");

        int result = add(10, 20);
        System.out.println("Sum: " + result);
    }
}
