package tutorial.t003;

public class VariablesTest {
    final static int MAX_COUNT = 5;  // should work here
    static int apple;
    static boolean banana;

    public static void main(String[] args){

        int carrot;

        // int *123 = 5; // this should fail
        // fails with "error: not a statement"

        int $123 = 5; // this should work but is not conventional

        int _123 = 5; // this should also work but is not conventional

        // int 123$ = 5; // this should fail
        // fails with "error: not a statement"

        // int apple bottom = 5; // this should fail
        // fails with "error: ';' expected"

        int apple_bottom = 5; // this should also work but is not conventional

        // final static int MAX_COUNT = 5; // static fields cannot be local variables
        // fails with "error: modifier static not allowed here"

        System.out.println(MAX_COUNT);  // prints out the static field
        final int MAX_COUNT = 7;  // should work here too, lets see if there is a conflict
        // no conflict, local variable takes priority
        System.out.println(MAX_COUNT);  // prints out the local variable instead of the static field
        othermain();

        // System.out.println(apple);
        // fails with "error: non-static variable apple cannot be referenced from a static context"

        System.out.println("apple (static field): " + apple);   // default value of 0, bad style but works.
        System.out.println("banana (static field): " + banana); // default value of false, bad style but works.

        // System.out.println("carrot (local variable): " + carrot); // should fail
        // fails with "error: variable carrot might not have been initialized"
    }

    public static void othermain(){
        System.out.println(MAX_COUNT);
        // Uses the global MAX_COUNT static field
    }
}