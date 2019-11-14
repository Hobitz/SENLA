package Z5TZ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Z5TZ
{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of the sequence from 0 to 100: ");
        int n = Integer.parseInt(in.readLine());
        if (!(n < 0 || n > 100)) {
            for (int i = 0; i < n + 1; i++) {
                if (isPalindrome(i)) System.out.println(i);
            }
        } else System.out.println("The length of the sequence must be in the range from 0 to 100.");
    }

    static boolean isPalindrome(int number) {
        int num = number;
        int reverse=0,rmd;
        while(number > 0)
        {
            rmd = number % 10;
            reverse = reverse * 10 + rmd;
            number = number / 10;
        }
        if(reverse == num){
        return true;}
        else return false;

    }
}
