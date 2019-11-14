import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Z1TZ {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter integer number: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double i = Double.parseDouble(reader.readLine());
        if (i == 0){
            System.out.println("The number is even, is not prime number and not composite");
        }
        else if (i == 1){
            System.out.println("The number is not even, is not prime number and not composite");
        }
        else {
            if (i % 1 == 0) {
                System.out.println("Number integer");
                if (i % 2 == 0) System.out.println("Even");
                else System.out.println("Not even");
                if (isPrime(i))
                    System.out.println("Prime number");
                else
                    System.out.println("Composite number");
            } else {
                System.out.println("Number not integer");
            }
        }
    }
    public static boolean isPrime(double n) {
        if (n < 2) return false;
        for (int p = 2; p < Math.sqrt(n); p++) {
            if (n % p == 0) return false;
        }
        return true;
    }
}

