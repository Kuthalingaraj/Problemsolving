// Bubble sorting Array

public class Bubblesort {
    // Swap the element method
    //{33,89,2,34};

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    //implement a buble sort
    public static int[] bubblesort(int[] arr,int n){
        for (int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    count++;
                }
            }
            if(count==0){
                return arr;
            }
        }
        return arr;
    }
    public static void main(String[]args){
        int n=4;
        int[] arr ={33,89,2,34};
        bubblesort(arr, n);
        for(Integer i : arr)
        System.out.print(i + "    ");
    }
}
