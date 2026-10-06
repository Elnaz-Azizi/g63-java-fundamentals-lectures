package se.lexicon;

public class MethodDemo {

    // 1. Method with no return (void) and no parameters
    public static void sayHello() {
        IO.println("Hello from the Calculator!");
    }

    // 2. Method with parameters
    public static void printSum(int a, int b) {

        IO.println("The sum is: " + (a + b));
    }

    // 3. Method with a Return Type
    public static int multiply(int x, int y) {
        int result = x * y;
        return result; // Sends the result back to the caller

    }


    void main() {
        // Calling static methods directly using the Class name
        sayHello();

        // Calling a static method with arguments
        printSum(10, 5); // 10 and 5 are arguments

        // Calling a static method and storing the return value
        int result = multiply(4, 3);
        IO.println("The multiplication result is: " + result);
    }
}