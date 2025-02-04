import edu.greenriver.sdev333.BST;
import edu.greenriver.sdev333.SeparateChainingHashST;
import edu.greenriver.sdev333.SymbolTable;
import edu.greenriver.sdev333.SequentialSearchST;

import java.util.Scanner;

/**
 * Basic symbol table test client
 * p. 370 of Sedgewick and Wayne
 * Authors have a running example throughout the text, with pictures of
 *  "S I M P L E E X A M P L E" and we rewrote the client to be in our style
 *  of writing Java code in our program.
 */
public class BasicTestClient {
    public static void main(String[] args) {
        String inputString = "S E A R C H E X A M P L E"; // this the key

        Scanner input = new Scanner(inputString);

        // You can replace the implementation with any class that implements
        // SymbolTable interface
        SymbolTable<String, Integer> st = new BST<>(); // BST implementation
        //SymbolTable<String, Integer> st = new SeparateChainingHashST<>(); // SeparateChainingHashST implementation


        int i = 0; // the value
        while (input.hasNext()) {
            String key = input.next();
            st.put(key, i);
            i++;
        }

        for (String s : st.keys()) {
            System.out.println(s + " " + st.get(s));
        }


        System.out.println("\nTesting BST methods --------");
        System.out.println("Min = " + ((BST<String, Integer>) st).min());
        System.out.println("Max = " + ((BST<String, Integer>) st).max());
        System.out.println("Floor of J = " + ((BST<String, Integer>) st).floor("J"));
        System.out.println("Ceiling of J = " + ((BST<String, Integer>) st).ceiling("J"));
        System.out.println("Select Key at rank 4 = " + ((BST<String, Integer>) st).select(4));
        System.out.println("Rank of J = " + ((BST<String, Integer>) st).rank("J"));



    }
}
