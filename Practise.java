import java.util.StringTokenizer;
import java.util.Scanner;

public class Practise {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sent = sc.nextLine();

        StringTokenizer str = new StringTokenizer(sent);

        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
        System.out.println(str.countTokens());

        sc.close();
    }
}