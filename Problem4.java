import java.util.Scanner;

/**
 * Created by PC-PC on 3/31/2016.
 */
public class Problem4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split("(\\s+)|(')|(\\-)");

        System.out.print(input.length);
    }
}

