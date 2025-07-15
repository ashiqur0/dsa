/*
Hash Map: is a form of Hash Table data structure
A Hash Map is a form of Hash Table data structure that usually holds a large number of entries.
Using a Hash Map we can search, add, modify, and remove entries really fast.
Hash Maps are used to find detailed information about something.
*/


package Data_Structure.Hash_Tables;

import java.util.ArrayList;
import java.util.List;

class Pair {
    int key;
    String value;

    public Pair(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

public class HashMap {

    static class  SimpleHashMap {
        private final List<List<Pair>> buckets;

        public SimpleHashMap(int size) {
            buckets = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                buckets.add(new ArrayList<>());
            }
        }

        private int hashFunction(int key) {
            String key1 = String.valueOf(key);
            int sum = 0;
            for (char c : key1.toCharArray()) {
                sum += c;
            }
            return sum % buckets.size();
        }

        public void put(int key, String value) {
            int index = hashFunction(key);
            List<Pair> bucket = buckets.get(index);
            
            for (Pair pair : bucket) {
                if (pair.key == key) {
                    pair.value = value;
                    return; 
                }
            }

            bucket.add(new Pair(key, value));
        }

        public String get(int key) {
            int index = hashFunction(key);
            List<Pair> bucket = buckets.get(index);

            for (Pair pair : bucket) {
                if (pair.key == key) {
                    return pair.value;
                }
            }
            return null;
        }

        public void remove(int key) {
            int index = hashFunction(key);
            List<Pair> bucket = buckets.get(index);
            bucket.removeIf(pair -> pair.key == key);
        }

        public void printMap() {
            for (int i = 0; i < buckets.size(); i++) {
                List<Pair> bucket = buckets.get(i);
                System.out.print("Bucket " + i + ": ");
                bucket.forEach(pair -> System.out.print("[" + pair.key + ": " + pair.value + "]"));
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        SimpleHashMap hashMap = new SimpleHashMap(10);
        hashMap.put(48, "Tanzid");
        hashMap.put(23, "Pollob");
        hashMap.put(9, "Ashiqur");
        hashMap.put(35, "Nahrul");
        hashMap.put(21, "Sabid");
        hashMap.put(65, "Dipto");
        hashMap.put(55, "Chanchal");
        hashMap.put(32, "Samiul2");
        hashMap.put(57, "Roktim");
        hashMap.put(29, "Arif");
        hashMap.put(1, "Samiul1");
        hashMap.put(14, "Alim");

        hashMap.printMap();

        System.out.println(hashMap.get(48));
    }
}