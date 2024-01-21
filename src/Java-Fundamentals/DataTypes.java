/*
 * DataType - It sepecifys the different size and values that can be stored in variables.
 * There are two type of dataTypes are their in java 1) primitive DataTypes
 *                                                   2) Non-primitive DataTypes
 * 
 * primitive data type includes boolean, char, byte, short, int, long, float, double.
 * Non-primitive data type includes classes, interfaces, Arrays and strings etc..
 */

public class DataTypes {
    public static void main(String[] args) {
        // Boolean can store two value ture and false.
        // basically it is one byte of information, but it's size can't be specified.
        // default value for boolean is false.
        boolean value = false;
        System.out.println(value);

        // Byte data type is a 8-bit signed two's complement integer.The value range of 
        // byte data type is between -128 to 127. It is used to save memory in large
        // array where the memory saving is more important.Becase byte is 4 times smaller
        // than an integer.
        // default value for byte is 0.
        byte a = -128;byte b = 127;

        // Short data type is a 16-bit signed two's complement integer.The vlaue range of
        // short data type is between -32,768 to 32,767.It is used to save memory in large
        // array like byte data type.But, a short data type is 2 times smaller than integer.
        // default value for short is 0.
        short x = 32767; short y = -32768;
        
        // Int data type is a 32-bit signed two's complement integer.The value range of int
        // data type is between -(2^31) to (2^31)-1.
        // Int data type is generally used to store the integers if their is no problem with
        // memory storage.default value for in is 0.
        int i = 2147483647;int j = -2147483648;

        // Long data type is a 64-bit two's complement integer.The value range of long data
        // type is between -(2^63) to (2^63)-1.This long data type is used store the integer
        // when the range of values is more than int.
        long variableOne = 1000000L;long variableTwo = -20000000L;

        // Float data type is single-precison 32-bit IEEE 754 floating point.It value range is
        // unlimited.It is recommended to use float(instead of double) when you want to save 
        // the memory in large array of floating points.float never used for precise values like
        // currency and it's default value is 0.0f.
        float floatValue = 1.00f;

        // Double data type is double-precision 64-bit IEEE 754 floating point.It value range is
        // unlimited.double data type is also never used for precise values like currency and 
        // default value is 0.0d
        double doubleValue = 2.123;

        // Char data type is a single 16-bit unicode character.It value range is '\u0000' to '\uffff'
        // 0 to 65535.Char data type is used to store characters.
        char ch = 'A';

       //How byte data type can be useful for saving memory in larger arrays?
       //suppose i have 20 numbers to store in array it can be stored in different ways using byte or
       //short or int or long, To get the different we will see two ways

       byte[] numbers1 = new byte[20];

       int[] numbers2 = new int[20];
      //numbers1 storage is lesser than numbers2 because in byte array 20 byte instances take 20 bytes of 
      //memory, but in-case of integer 20 int instances take 20x4 = 80 bytes of memory.
      // memory of numbers1 < memory of numbers2. 
    }
}
