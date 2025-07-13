/*
Hash Table: is a data structure designed to be fast to work with

Hash Table elements are stored in storage containers called buckets.
Every Hash Table element has a part that is unique that is called the key.
A hash function takes the key of an element to generate a hash code.

*/

package Data_Structure.Hash_Tables;

import java.util.LinkedList;

public class Hash_Table {

    @SuppressWarnings("unchecked")
    static LinkedList<String>[] myHashSet = new LinkedList[10];

    public static int hashFunction(String value) {
        int sum = 0;
        for (char c : value.toCharArray()) {
            sum += c;
        }

        return sum % 10;
    }

    public static void add(String value) {
        int index = hashFunction(value);
        LinkedList<String> bucket = myHashSet[index];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    public static boolean contains(String value) {
        int index = hashFunction(value);
        LinkedList<String> bucket = myHashSet[index];
        return bucket.contains(value);
    }

    public static void main(String[] args) {
        for (int i = 0; i < myHashSet.length; i++) {
            myHashSet[i] = new LinkedList<>();
        }
        add("Fahim");
        add("Murad");
        add("Ashiqur");
        add("Alim");
        add("Xobayer");
        add("Rabbi");

        for (LinkedList<String> bucket : myHashSet) {
            System.out.println(bucket);
        }

        System.out.println("Contains Ashiqur: " + contains("Ashiqur"));
    }
}
