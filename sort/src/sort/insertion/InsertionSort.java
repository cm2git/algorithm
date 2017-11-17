package sort.insertion;

/**
 * @autthor Mchi
 * @since 2017/11/16
 */

public  abstract class InsertionSort {

    public static void sort(int[] arr){

        for(int j=1;j<arr.length;j++){

            int temp = arr[j];
            int i = j-1;

            while (i>=0 && arr[i]>temp){
                arr[i+1] = arr[i];
                i--;
            }

            if(i<j-1){
                arr[i+1] = temp;
            }

        }
    }

}
