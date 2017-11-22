package sort.quick;

/**
 * @autthor Mchi
 * @since 2017/11/22
 */

public abstract class QuickSort {

    //-------------------------------------------------------------------
    //  QUICKSORT(A,p,r)
    //      if p<r
    //         then q<-PARTITION(A,p,r)
    //             QUICKSORT(A,p,q-1)
    //             QUICKSORT(A,q+1,r)
    //
    //
    //  PARTITION(A,p,r)
    //      x<-A[r]
    //      i<-p-1
    //  for j<-p to r-1
    //      do if A[j]<=x
    //            then i<-i+1
    //                 exchange A[i]<->A[j]
    //  exchange A[i+1]<->A[r]
    //  return i+1
    //-------------------------------------------------------------------

    public static void sort(int[] arr){

          int p = 0;
          int r = arr.length-1;
          quickSort(arr,p,r);

    }

    //-------------------------------------------------------------------
    //  QUICKSORT(A,p,r)
    //      if p<r
    //         then q<-PARTITION(A,p,r)
    //             QUICKSORT(A,p,r)
    //             QUICKSORT(A,p,r)
    //
    //-------------------------------------------------------------------
    /**
     * quick sort
     * @param arr sorted array
     * @param p   begin index of array arr
     * @param r   end index of array arr
     */
    static void quickSort(int[] arr,int p,int r){

        if(p<r){
            int q = partition(arr,p,r);
            quickSort(arr,p,q-1);
            quickSort(arr,q+1,r);
        }
    }
    //-------------------------------------------------------------------
    //  PARTITION(A,p,r)
    //      x<-A[r]
    //      i<-p-1
    //  for j<-p to r-1
    //      do if A[j]<=x
    //            then i<-i+1
    //                 exchange A[i]<->A[j]
    //  exchange A[i+1]<->A[r]
    //  return i+1
    //-------------------------------------------------------------------
    /**
     * quick sort partition
     * @param arr sorted array
     * @param p   begin index of array arr
     * @param r   end index of array arr
     */
    static int partition(int[] arr,int p,int r){
        int x = arr[r];
        int i = p-1;
        int temp = 0;
        for(int j=p;j<r;j++){
            if(arr[j]<=x){
                i = i+1;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;

    }


}
