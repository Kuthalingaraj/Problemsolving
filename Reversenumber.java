import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args){
        Scanner a =new Scanner(System.in);
        System.out.print("Enter the Numbers :");
        int b = a.nextInt();
        while(b>0)
        {
            int c = b%10;
            System.out.print(c);
            b=b/10;
        }
    }
    
}
