import java.util.Scanner;

public class Palindrome{
	//This function checks if the given string is a palindrome or not.
	public static boolean checkPalindrome(String a){
		int left = 0;
		int right = a.length()-1;
		while(left <= right){
			if (a.charAt(left) != a.charAt(right)) 
			return false;
			left++;
			right--;
		}
		return true;
	}
	//Main Function
	public static void main(String[] args){
		
		Scanner palindrome = new Scanner(System.in);
		System.out.println("Enter the String Whether is a Palindrome or Not!!!!!!!!");
		String a= palindrome.nextLine();
		if (checkPalindrome(a)) 
		System.out.println(a + "" + "Is a Palindrome String");
		else{
			System.out.println(a+ "It is not a Palindrome");
		}
	}
}