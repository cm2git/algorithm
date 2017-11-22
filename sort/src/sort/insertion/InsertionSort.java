package sort.insertion;

/**
 * @autthor Mchi
 * @since 2017/11/16
 */

public  abstract class InsertionSort {

    //-------------------------------------------------------------------
    //INSERTION-SORT(A)
    //      for j <- 2 to length[A]
    //          do key <- A[j]
    //             i <- j-1
    //             while i>0 and A[i]>key
    //                   A[i+1] <- A[i]
    //                   i <- i-1
    //          A[i+1] <- key
    //-------------------------------------------------------------------

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
