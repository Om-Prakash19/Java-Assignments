/*
 * Question -> What is the difference between collections and stream ? Explain with example
 * 
 * Answer : If we want to come out of disadvantage of array that is contiguous memory allocation,fixed size and homogeneous data and want to store collection of both homogeneous and heterogeneous data in discrete memory allocation without thinking of size then we should use collection API.
 * On the other hand if we want to process this data present in the collection without changing the original objects in the collection then we should go with streams.
 * A simple example is : 
 */

package APIAndAnnotation;

import java.util.*;
import java.util.stream.*;

public class Question3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(20, 43, 12, 98, 35, 33);

        System.out.println(list);

        Stream<Integer> data = list.stream();
        Stream<Integer> sortedData = data.sorted();

        sortedData.forEach(n -> System.out.println(n));
    }
}
