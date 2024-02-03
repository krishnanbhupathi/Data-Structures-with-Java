// Problem : Input currency in rupees and output in USD.
import java.util.Scanner;

class ConvertCurrency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in ruppes: ");
        double rupees = input.nextDouble();
        double USD = rupees / 74.42;

        System.out.printf("%.3f in USD equals to $%.3f",rupees,USD);
    }
}
