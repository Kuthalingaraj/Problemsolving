import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args){
        Scanner rev = new Scanner(System.in);
        System.out.println("Enter the String :");
        String r = rev.next();
        StringBuilder sb =new StringBuilder();
        char[] reverse = r.toCharArray();
        for(int i = r.length()-1; i>=0; i--){
            sb.append(reverse[i]);
        }
        System.out.println("Reversed String :" + sb.toString());
    }
    
}
