import java.util.Arrays;
import java.util.Scanner;

public class MergingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m ; i++){
            b[i] = sc.nextInt();
        }

        int[] c = new int[n+m];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(a[i] <= b[j]){
                c[k] = a[i];
                k++;
                i++;
            }else{
                c[k] = b[j];
                k++;
                j++;
            }
        }

        while(i < n){
            c[k] = a[i];
            k++;
            i++;
        }
        while(j < m){
            c[k] = b[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(c));


    }
}

// 6 7
//1 6 9 13 18 18
//2 3 8 13 15 21 25


// 4 5
// 1 2 3 4
// 0 5 6 7 8

// result : 0 1 2 3 4 5 6 7 8