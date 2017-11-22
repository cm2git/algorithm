package sort.heapify;

/**
 * @autthor Mchi
 * @since 2017/11/22
 */

public abstract class HeapSort {

    static int heapSize = 0;

    public static void sort(int[] arr){

        buildMaxHeap(arr);
        print(arr);

        for(int i=arr.length-1;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapSize--;
            maxHeapify(arr,0);
        }
    }



    static void buildMaxHeap(int[] arr){
        heapSize = arr.length;
        //heapSize/2  是最后一个有叶节点的根节点（找最后一个元素的父节点i/2）,构建最大堆的层次顺序是从下往上
        for(int i=arr.length/2;i>=0;i--){
            maxHeapify(arr,i);
        }

        //error
      /*  for(int i=0;i<=heapSize/2;i++){
            maxHeapify(arr,i);
        }*/
    }

    /**
     * immustabale loop body
     * create max heap
     * @param arr sorted array
     * @param i   index of arr
     */
    static void maxHeapify(int[] arr,int i){

        int largest = 0;
        int left = (i<<1)+1;
        int right = left+1;

        if(left<heapSize && arr[left]>arr[i]){
            largest = left;
        }else{
            largest = i;
        }

        if(right<heapSize && arr[right]>arr[largest]){
            largest = right;
        }


        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr,largest);
        }

    }

    static void print(int[] arr){

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

}
