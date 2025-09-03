import java.util.Arrays;

public class SortColors {

    static void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void sortColor(int[] arr){
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        while(mid <= end){
            if(arr[mid] == 0){
                swap(arr, mid,start);
                start++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{ // arr[mid] == 2
                swap(arr,mid, end);
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        System.out.println("Before "+ Arrays.toString(arr));
        sortColor(arr);
        System.out.println("After "+Arrays.toString(arr));
    }
}
