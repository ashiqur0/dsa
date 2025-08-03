package Data_Structure.Hash_Tables;

/*public class z_practice {

    // static String[] myHashSet = new String[10];
    static String[] myHashSet = {null, "Jones", null, "Lisa", null, "Bob", null, "Siri", "Pete", null};

    static int hashFunction(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c;
        }
        return sum % 10;
    }

    static boolean contains(String name) {
        int index = hashFunction(name);
        return myHashSet[index] != null && myHashSet[index].equals(name);
    }

    static void delete(String name) {
        int index = hashFunction(name);
        myHashSet[index] = null;
    }

    public static void main(String[] args) {
        // int index = hashFunction("Bob");
        // str[index] = "Bob";                 // insert 
        
        // System.out.println(str[index]);     // search

        // delete
        System.out.println("Pete is in the Hash Set: " + contains("Pete"));
        delete("Pete");
        System.out.println("Pete is in the Hash Set: " + contains("Pete"));
    }
}
*/

import java.util.List;
import java.util.ArrayList;

public class z_practice {

    static class SimpleHashSet {    
        int size;
        List<List<String>> buckets;

        SimpleHashSet(int size) {
            this.size = size;
            this.buckets = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                buckets.add(new ArrayList<>());
            }
        }

        int hashFunction(String value) {
            int sum = 0; 
            for (char c : value.toCharArray()) {
                sum += c;
            }
            return sum % size;
        }
    
        void add(String value) {
            int index = hashFunction(value);
            List<String> bucket = buckets.get(index);
            if (!bucket.contains(value)) {
                bucket.add(value);
            }
        }

        void delete(String value) {
            int index = hashFunction(value);
            List<String> bucket = buckets.get(index);
            bucket.remove(value);
        }

        boolean search(String value) {
            int index = hashFunction(value);
            List<String> bucket = buckets.get(index);
            if (bucket.contains(value)) {
                return true;
            }
            return false;
        }

        void print(List<List<String>> buckets) {
            for (List<String> bucket : buckets) {
                System.out.println(bucket);
            }
        }
    }

    public static void main(String[] args) {
        SimpleHashSet hashSet = new SimpleHashSet(10);
        hashSet.add("Murad");
        hashSet.add("Ashiqur");
        hashSet.add("Alim");
        hashSet.add("Rabbi");
        hashSet.add("Munna");
        hashSet.add("Sabid");
        hashSet.add("Pollob");
        hashSet.add("Arif");

        hashSet.print(hashSet.buckets);
        System.out.println("Arif is in hashset: " + hashSet.search("Arif"));
        
        hashSet.delete("Pollob");
        hashSet.print(hashSet.buckets);
    }
}