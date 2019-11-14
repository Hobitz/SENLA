package Z4TZ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Z4TZ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter text: ");
        String text = bf.readLine();
        System.out.print("Enter word: ");
        String word = bf.readLine();
        text.trim();
        word.trim();
        text = text.toLowerCase();
        String word1 = word.toLowerCase();
        text += "";
        String subs = "";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            subs += text.charAt(i);
            subs.trim();
            if (word1.equals(subs)) {
                count++;
                subs = "";
            }
            if (text.charAt(i) == ' ')
            {
                subs = "";
            }
        }
        System.out.println("Number of words in the text " + word + " = " + count);
    }
}
