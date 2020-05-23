package tutorial.t003;

public class MultiDimArrayDemo {
    public static void main(String[] args){
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0]+names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2]+names[1][1]);

        System.out.println("Length of Array 'names': "+names.length);
        System.out.println("Length of Array 'names[0]': "+names[0].length);
        System.out.println("Length of Array 'names[1]': "+names[1].length);

    }    
}