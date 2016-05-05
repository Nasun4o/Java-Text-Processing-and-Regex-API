import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PC-PC on 3/31/2016.
 */
public class Problem1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Pattern pattern = Pattern.compile("([a-z\\.]+)@([a-z\\.]+\\b[a-z]+)");

        Matcher matcher = pattern.matcher(console.nextLine());

        while (matcher.find()){
            System.out.print(matcher.group(1));
            System.out.println(matcher.group(2));
        }
    }
}
