/*
Hash Set: is a form of Hash Table data structure
A Hash Set is a form of Hash Table data structure that usually holds a large number of elements.
Using a Hash Set we can search, add, and remove elements really fast.
Hash Sets are used for lookup, to check if an element is part of a set.
*/

package Data_Structure.Hash_Tables;

import java.util.ArrayList;
import java.util.List;

public class HashSet {

    static class SimpleHashSet {
        private final int size;
        private final List<List<String>> buckets;

        public SimpleHashSet(int size) {
            this.size = size;
            this.buckets = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                buckets.add(new ArrayList<>());
            }
        }

        private int hashFunction(String value) {
            // return value.chars().reduce(0, Integer::sum) % size;
            int sum = 0; 
            for (char c : value.toCharArray()) {
                sum += c;
            }
            return sum % size;
        }

        public void add(String value) {
            int index = hashFunction(value);
            List<String> bucket = buckets.get(index);
            if(!bucket.contains(value)) {
                bucket.add(value);
            }
        }

        public boolean search(String value) {
            int index = hashFunction(value);
            List<String> bucket = buckets.get(index);
            return bucket.contains(value);
        }

        public void delete(String value) {
            int index = hashFunction(value);
            List<String> bucket = buckets.get(index);
            bucket.remove(value);
        }

        public void printSet() {
            for (int i = 0; i < buckets.size(); i++) {
                List<String> bucket = buckets.get(i);
                System.out.println(bucket);
            }
        }
    }

    public static void main(String[] args) {
        SimpleHashSet hashSet = new SimpleHashSet(10);
        hashSet.add("Tanzid");
        hashSet.add("Pollob");
        hashSet.add("Ashiqur");
        hashSet.add("Nahrul");
        hashSet.add("Sabid");
        hashSet.add("Dipto");
        hashSet.add("Chanchal");
        hashSet.add("Samiul2");
        hashSet.add("Roktim");
        hashSet.add("Arif");
        hashSet.add("Samiul1");
        hashSet.add("Alim");

        System.out.println("Arif is in the set: " + hashSet.search("Arif"));
        System.out.println("Tanzid is in the set: " + hashSet.search("Tanzid"));
        System.out.println("Pollob has hash code: " + hashSet.hashFunction("Pollob"));
        
        hashSet.printSet();
    }
}
