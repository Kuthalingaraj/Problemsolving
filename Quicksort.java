public class Quicksort {
    // this is the partition function to quick sort algoritham
    static int partition(int[] arr, int l, int r) {
        int p_ind = l;
        int pivot = r;
        for (int i = l; i < r; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[p_ind];
                arr[p_ind] = temp;
                p_ind++;
            }
        }
        arr[r] = arr[p_ind];
        arr[p_ind] = pivot;
        return p_ind;
    }

    // use recursive function implements the quick sort algorithm help of partition
    // funcotn
    static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int p_ind = partition(arr, l, r);
            quickSort(arr, l, p_ind - 1);
            quickSort(arr, p_ind + 1, r);
        }
    }

    // main method
    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 5,4,3,2,1,0 };
        quickSort(arr, 0, n - 1);
        for (int each : arr)
            System.out.print(each + "   ");
        System.out.println();
        

    }
}
