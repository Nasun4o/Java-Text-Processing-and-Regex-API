import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PC-PC on 3/31/2016.
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String str = console.nextLine().toLowerCase();
        String findStr = console.nextLine().toLowerCase();


        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = str.indexOf(findStr,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex ++;
            }
        }
        System.out.println(count);

    }
}
