import java.util.Scanner;

/**
 * Created by PC-PC on 3/31/2016.
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().toLowerCase().split("(\\s+|'|\\-)");
        String wordToFind = console.nextLine();
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i].contentEquals(wordToFind)) {
                count += 1;
            }
        }

        System.out.print(count);
    }
}