import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PC-PC on 3/31/2016.
 */
public class Problem5 {
    public static void main(String[] args) {

            Scanner console = new Scanner(System.in);
            String input = console.nextLine();

            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher m = pattern.matcher(input);

            while (m.find()) {
                System.out.print(m.group() + " ");
            }
        }
}
