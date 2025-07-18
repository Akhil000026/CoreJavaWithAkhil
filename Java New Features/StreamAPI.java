import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        /*
         
          the Stream API is used to process collections of objects.
          A stream in Java is a sequence of objects that supports various
          methods that can be pipelined to produce the desired result.
          
          => Enable us to perform operations like filtering, mapping, reducing, and sorting.

          SYNTAX: Stream<T> stream;

          Java Stream Features
          (1) A stream is not a data structure; instead, it takes input 
          from the Collections, Arrays, or I/O channels.
          (2) Streams don’t change the original data structure, 
          they only provide the result as per the pipelined methods.
          (3) Each intermediate operation is lazy, meaning that computation on the
          source data is only performed when the terminal operation is initiated.
          (4) The result of a stream operation is always a new stream.
          (5) Stream operations are either stateful or stateless.
          (6) Stream operations can be either sequential or parallel.

          Different Operations On Streams
          1.Intermediate Operations
           -> Methods are chained together.
          2.Terminal Operations

          Benefit of Java Stream
          No Storage
          Pipeline of Functions
          Laziness
          Can be infinite
          Can be parallelized
          Can be created from collections, arrays, Files Lines, Methods in Stream, IntStream etc.

          (1) Intermediate Operations
           Method	      Purpose	                             Returns

          1.map()	     Transform each element	             Stream of new values
          2.filter()	 Select elements based on condition	 Filtered stream
          3.sorted()	 Sort elements	                     Sorted stream
          4.flatMap()	 Flatten nested structures(s1+s2)	   Flattened stream
          5.distinct() Remove duplicates	                 Stream with unique
          6.peek()	   Log or inspect without changing	    Same stream

          
            (2) Terminal Operations
             Method	       Purpose	                                 Returns

            1.collect()	   Convert stream to collection	             Collection
            2.forEach()	   Perform action for each element	         void
            3.reduce()	   Combine elements into single value	     Optional<T>
            4.count()	   Count elements	                         long
            5.anyMatch()	Check if any element matches condition	 boolean
            6.allMatch()	Check if all elements match condition	 boolean
            7.noneMatch()	Check if no elements match condition	 boolean
            8.findFirst()	Get first element	                     Optional<T>    


         */
        List<String> names = Arrays.asList("akhil", "ankit", "ravi");

        List<String> upperNames = names.stream()
         .map(String::toUpperCase) //intermediate stream
          .collect(Collectors.toList()); //terminal operation
        // Print the result

         System.out.println(upperNames); // [AKHIL, ANKIT, RAVI]


         List<String> fruits = Arrays.asList("Mango", "Apple", "Banana");

        List<String> sorted = fruits.stream()
           .sorted()
           .collect(Collectors.toList());

           System.out.println(sorted); // [Apple, Banana, Mango]

            }


            
    
}
