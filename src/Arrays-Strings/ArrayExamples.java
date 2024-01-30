/* Data Structure: A data structure is a data organization, management, and storage format 
 *                 that is usually choosen to efficient access of data.
 *  Ex : linear data structure, tree data structure, hash data structure and graph data 
 *       structure.
 */

class ArrayExamples {

    public static void main(String[] args) {

        // Why do we need arrays?
        // Q : store a roll number
        int roll_number = 21;

        //Q : store a name of person
        String name = "Krishna";

        //Q : store 5 roll numbers
        int roll_no1 = 4;
        int roll_no2 = 5;
        int roll_no3 = 6;
        int roll_no4 = 7;

        // What if i want to store 500 roll number, the above way is not efficient!
        // At this place arrays comes into picture, Arrays are nothing but collection
        // of items that are of same data type stored at contigous memory location.
        // Syntax :
        // dataType[] variable_name = new dataType[size];
        // Q : we want to store 5 integers

        int[] data = new int[5]; // one type of declaration
        
        int[] data2 = {1, 2, 3, 4, 5}; // another type of declaration
      
        /* 1.datatype -> it is what datatype of elements you are going to store in array.
         * 2.The data type must be same for all elements inside the array.
         * 3. int[] data = new int[5]
         *   here int[] means the reference variable data is pointing to array of element of int datatype.
         * 4. new -> used to create an object in heap. If you are doing direct delcearation with data 
         *    java will do the same thing, creating array objects in the heap.
         */

        // Decleration: data3 is define in stack.(Compile time)
        int[] data3 ;

        // Initialization: Actual object is created here.(heap memeory - runtime)
        data3 = new int[10];

        //Array object are store in heap, heap memory is not continous and in java array are taking
        //dynamic memory allocation. Hence, arrays may not be continous -> Depends on JVM.

        // indices are used to access the element. starts from 0
        System.out.println("First element in data2: "+data2[0]);

        // For all the elements if don't give any value it will take 0.
        for(int element : data3) 
            System.out.print(element+" ");
        System.out.println();

        String[] names = new String[4];
        System.out.println(names[0]);
        // Prints null -> it is like special literal of null type. you can't take as dataType.
        // you can assign it to non-primitive.With primitive gives error

    }
}
