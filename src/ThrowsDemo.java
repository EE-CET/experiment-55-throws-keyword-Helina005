



import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {
    // Method that declares it throws an IOException
    static void check(int n) throws IOException {
        if (n < 0) {
            // Throw the exception if n is negative
            throw new IOException();
        } else {
            // Print the number if n is 0 or positive
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the integer input
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            try {
                // Call the method that might throw the exception
                check(n);
            } catch (IOException e) {
                // Catch the IOException and print the required message
                System.out.println("Caught: IO Exception");
            }
        }

        sc.close();
    }
}