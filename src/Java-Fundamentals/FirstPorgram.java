class FirstPorgram {
    /*
     *  class keyword is used to declare a class in java
     *  public keyword is access modifier that represents visibilit.It means it is visible to all.
     *  static is a keyword , if we declare any method as static, then method is known as static 
        method then it is a static method.The main advantage of static method is we don't need to 
        create a object to invoke that method. The main() method is invoked by JVM.
     *  void is return type of main method.It means it doesn't return value. 
     *  main is starting point of the program.The program starts execution from main method.
     *  String[] args is command line arguments - arguments that are passed at the  time of running
     *  java program. (Like javac FirstProgram.java 1 2 3 , here 1, 2, 3 are command line arguments)
     *  System.out.println() - it is used to print statements.
     *  Here System is a class, out is object of PrintStream class and println is method  of PrintStream
     *  class.
     */
    public static void main(String[] args) {

        System.out.println("Hello Everyone!");
        System.out.println("Command line Arguement "+args[0]);
    }
}
