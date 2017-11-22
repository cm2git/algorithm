package sort.bubble;

/**
 * @autthor Mchi
 * @since 2017/11/17
 */

public abstract class Bubble {

    //-------------------------------------------------------------------
    //Bubble-SORT(A)
    //      for i <- 1 to length[A]
    //          do for j <- length[A] downto i+1
    //                 do if A[j]<A[j-1]
    //                       then exchange A[j] <-> A[j-1]
    //-------------------------------------------------------------------
    public static void sort(int arr[]){

        for(int i=0;i<arr.length-1;i++){

            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }
}
