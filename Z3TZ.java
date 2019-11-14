import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Z3TZ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter words separated by a space in one line: ");
        String input = bf.readLine();
        String[] words = input.split("\\s+");
        System.out.println("Unsorted array: "+toUP(input));
        Arrays.sort(words);
        System.out.println("Sorted array: "+toUP(Arrays.toString(words)));
        Count(input);

    }

    public static String toUP(String s) {
        char[] result = s.toCharArray();
        if (Character.isAlphabetic(result[0])) result[0] = Character.toUpperCase(result[0]);
        String res = "" + result[0];
        for (int i = 1; i < result.length; i++) {
            if (Character.isAlphabetic(result[i]) && !Character.isAlphabetic(result[i - 1]))
                result[i] = Character.toUpperCase(result[i]);
            res += result[i];
        }
        return res;
    }
    public static void Count(String s){
        int count = 0;
        if(s.length() != 0){
            count++;
            for (int i = 0; i <s.length(); i++) {
                if(s.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("You enter "+count+" words");
    }
}