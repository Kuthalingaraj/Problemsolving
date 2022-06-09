//Check whether two given strings X and Y of sizes N and M respectively are anagram of each other or not.

import java.util.Arrays;
import java.util.Scanner;

public class Anagrom {
    public static boolean anagromornot(String a, String b) {
        if(a.length()!=b.length()){
            System.out.println("String value Mismatch please Enter the Match String!!!");
            return false;
        }

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        if (arr1.length != arr2.length)
            return false;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return true;
    }

    public static void main(String[] args) {

        Scanner anagrom = new Scanner(System.in);
        // System.out.println("Enter the First Number of String :");
        // int n = anagrom.nextInt();
        // System.out.println("Enter the Second Number of String :");
        // int m = anagrom.nextInt();
        System.out.println("Enter the 1St String :");
        String a = anagrom.next();
        System.out.println("Enter the 2nd String :");
        String b = anagrom.next();

        if (anagromornot(a, b))
            System.out.println("yes,Its a Anagrom");
        else
            System.out.println("No,Its a Not Anagrom");

    }
}
