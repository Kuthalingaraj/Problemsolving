
public class Duplicatearray {
    //this method is used to returns the sum of first N natural numbers.
    public static int sumOfNaturalNumbers(int N){
        int sum = N*(N+1);
        return sum/2;
    }
    //this method is used to find the duplicate element of the array...
    public static int findDuplicate(int[] arr,int n){
        int s1 =0;
        for(int i = 0;i<arr.length;i++)
        s1+=arr[i];
        int s2 = sumOfNaturalNumbers(n-1);
        int ans = s1-s2;
        return ans;
    }

    public static void main(String[] args){
        int n =5;
        int[] arr = {1,2,5,4,4};
        int ans = findDuplicate(arr, n);
        System.out.println(ans);
       
    }
}
