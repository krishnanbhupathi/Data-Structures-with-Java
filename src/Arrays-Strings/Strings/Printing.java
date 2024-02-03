import java.util.Arrays; 

class Pringing {

   public static void main(String[] args) {

       System.out.println(56); // method overloading
                               
       // Integer number = new Integer(56); This type of declearation is deprecated in newr version of java
       Integer number = Integer.valueOf(56);
       System.out.println(Integer.toString(number)); // same thing as above
       System.out.println("Krishna"); // method overloading 
       System.out.println(Arrays.toString(new int[] {1,2,3,4,5})); // println() method uses method overriding 

       String name = null;
       System.out.println(name); // prints null 
   }
} 
