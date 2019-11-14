package Z2TZ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Z2TZ {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter first number:");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(r.readLine());
        System.out.print("Enter second number:");
        double b = Double.parseDouble(r.readLine());
        double nod= gcd(a,b);
        System.out.println("Smallest common divisor: "+nod);
        double nok = a*b/nod;
        System.out.println("Least common multiple: "+nok);
    }
    public static long gcd(double n1, double n2){
        return (long) (n2 == 0 ? n1 : gcd(n2,n1 % n2));
    }
}
