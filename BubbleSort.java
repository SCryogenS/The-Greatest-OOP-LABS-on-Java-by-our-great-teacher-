import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int[] arr){
        boolean swapped;
        int n = arr.length;

        for (int i = 0;i<n;i++){
            swapped = false;

            for (int j= 0 ; j<n-1-i;j++){
                if (arr[j] > arr[j+1]){
                    int rem = arr[j];
                    arr[j] = arr[j+1]; 
                    arr[j+1] = rem;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {982,55641654,56,564,26,633,8461,1446568979,32324641,1,2,3
            ,4,5,};
        bubblesort(array);
        System.out.println(Arrays.toString(array));
    }
}
