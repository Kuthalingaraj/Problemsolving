import java.util.Scanner;

class Primecheck{
// 	//This function checks wether a particular number is prime or not.
// 	public static boolean checkPrime(int n){
// 		for (int i=2;i<=Math.sqrt(n);i++){
// 			if (n % i == 0) 
//             return false;
// 		}
// 		return true;
// 	}
// 	//Main Function.
// 	public static void main(String[] args){
// 		int n = 115;
// 		if (checkPrime(n)) 
//         System.out.println("Yes");
// 		else{
// 			System.out.println("No");
// 		}
// 	}
public static boolean checkPrime(int n){
     		for (int i=2;i<=Math.sqrt(n);i++){
    			if (n % i == 0) 
                 return false;
     		}
     		return true;
        }


public static void main(String[]args){
    Scanner prime = new Scanner(System.in);
    System.out.println("Enter the Number :");
    int n = prime.nextInt();
    if(checkPrime(n))
    System.out.println("Prime");
    else{
        System.out.println("Not a Prime");
    }
   
}
}
 