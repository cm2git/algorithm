package sort.bubble;

/**
 * @autthor Mchi
 * @since 2017/11/17
 */

public abstract class Bubble {


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
