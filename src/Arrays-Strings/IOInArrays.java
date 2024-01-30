import java.util.Scanner;
import java.util.Arrays;

class IOInArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] data = new int[5];
        data[0] = 12;
        data[1] = 14;
        data[2] = 16;
        data[3] = 18;
        data[4] = 20; // index starts from 0 so last element is stored at size-1.
        System.out.println("Third element in data : "+data[2]);

        // input using for loop 
        int[] inputArray = new int[5];
        System.out.print("Enter the array elements: ");
        for(int i = 0 ; i < 5; i++) {
            inputArray[i] = input.nextInt();
        }

        // output of inputArray using for loop
        for(int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]+" ");
        }
        System.out.println();
        
        // we can use enhanced for loop to get elements of array
        System.out.print("Using For Each loop : ");
        for(int num : inputArray) 
            System.out.print(num+" "); // here num represent element of array
        System.out.println();

        // System.out.println(inputArray[5]); -> Index out of Bound error

        // toString is present in Arrays internally uses for loop and format's the elements.
        System.out.println(Arrays.toString(data));

        // Array of objects
        String[] stringArray = new String[5];
        System.out.print("Enter five string values: ");
        for(int i = 0 ; i < 5 ; i++)
            stringArray[i] = input.next();
        // Modifying the array
        stringArray[2] = "Krishna"; // direclty accessing and modifing value

        System.out.print("Printing array using toStrings method: "); 
        System.out.println(Arrays.toString(stringArray));

    }
}
