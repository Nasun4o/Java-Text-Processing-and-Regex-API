import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PC-PC on 3/31/2016.
 */
public class Problem6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        Pattern pattern = Pattern.compile("\\b([A-Z])([a-zA-Z]+)?([A-Z])\\b");
        Matcher m = pattern.matcher(input);

        while (m.find()) {
            System.out.print(m.group() + " ");
        }
    }
    }

