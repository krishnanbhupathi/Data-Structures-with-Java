package Problems;

public class Patterns {

    static void pattern1(int n){

        for (int row = 1; row <= n ; row++) { // how many rows we want

            for (int col = 1; col <= n; col++) { // how many cols
                System.out.print("* "); // what we need to print
            }
            System.out.println();
        }
    }

    static void pattern2(int n){

        for (int row = 1; row <= n ; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){

        for (int row = 0; row < n; row++) {
            // spaces
            for(int spaces = 0; spaces < row; spaces++){
                System.out.print("_ ");
            }
            // stars
            for(int stars = 0; stars < n-row; stars++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern4(int n){
        // n = 4
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4

        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2*n - 1 ; row++) { // rows
            int stars = (row > n)? 2*n - row : row; // how many stars
            for (int col = 1; col <= stars; col++) { // printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 1; row <= 2*n -1 ; row++) {
            int totalColInRow = (row > n) ? 2*n - row: row;
            int spaces = n - totalColInRow;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        pattern1(3);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(6);
        pattern6(6);
    }
}
