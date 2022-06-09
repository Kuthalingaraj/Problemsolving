import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner fizz = new Scanner(System.in);
        System.out.println("Enter the Numbers :");
        int n = fizz.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("ZOHOCORP" + "       ");
            else if (i % 3 == 0)
                System.out.print("ZOHO" + "     ");
            else if (i % 5 == 0)
                System.out.print("CORP" + "     ");
             else {
                 System.out.print(i + "   ");
            }

        }

    }
}