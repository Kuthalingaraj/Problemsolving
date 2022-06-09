import java.util.Scanner;

public class Powerof2 {
    public static boolean powerOf(int n) {
        int counter = 0;
        while (n > 0) {
            if (n % 2 == 1)
                counter++;
            n = n / 2;
        }
        return counter == 1;
    }

    public static void main(String[] args) {

        Scanner pow = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = pow.nextInt();
        if (powerOf(n)) {
            System.out.println(n + "is a power of 2");
        } else
            System.out.println(n + "Not a power of 2");

    }

}
