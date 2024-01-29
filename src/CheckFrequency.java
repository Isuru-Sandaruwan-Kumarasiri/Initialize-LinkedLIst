import java.util.*;

public class CheckFrequency {



        public static void main(String[] args) {
            ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5, 2));

            // Using HashSet to get unique elements
            Set<Integer> uniqueElements = new HashSet<>(a);

            // Loop through unique elements and find their frequencies
            for (int element : uniqueElements) {
                int count = Collections.frequency(a, element);
                System.out.println("Element " + element + " occurs " + count + " times.");
            }
        }
    }


