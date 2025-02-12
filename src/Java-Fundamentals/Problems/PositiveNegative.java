package Problems;
import java.io.*;
import java.util.Scanner;


public class PositiveNegative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =   input.nextInt();

        if(a < 0)
            System.out.println("Negative");
        else if(a == 0)
            System.out.println("Zero");
        else
            System.out.println("Positive");
    }
}
