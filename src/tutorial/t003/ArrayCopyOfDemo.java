package tutorial.t003;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args){
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                            'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);

        System.out.println(copyTo);
    }    
}

/**
 * Some other useful operations provided by methods in the java.util.Array class, are:
 *  Searching an array for a specific value to get the index at which it is placed (the binarySearch method).
 *  Comparing two arrays to determine if they are equal or not (the equals method).
 *  Filling an array to place a specific value at each index (the fill method).
 *  Sorting an array into ascending order. This can be done either sequentially, using the sort method,
 *      or concurrently, using the parallelSort method introduced in Java SE 8.  Parallel sorting
 *      of large arrays on multiprocessor systems is faster than sequential array sorting.
 */