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
/*import java.util.List;
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
}*/
/*
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

        void update(String value, String newValue) {
            int index = hashFunction(value);
            List<String> bucket = buckets.get(index);
            int position = bucket.indexOf(value);
            if (position != -1) {
                bucket.set(position, newValue);
            }
        }

        void print(List<List<String>> buckets) {
            for (List<String> bucket : buckets) {
                System.out.println(bucket);
            }
        }
    }

    public static void main(String[] args) {
        SimpleHashSet hashSet = new SimpleHashSet(10);
        hashSet.add("Samiul");
        hashSet.add("Joy");
        hashSet.add("Nahrul");
        hashSet.add("Musfique");
        hashSet.add("Tanzid");
        hashSet.add("Chancal");
        hashSet.add("Roktim");
        hashSet.add("Biddut");
        hashSet.add("Dipto");

        hashSet.update("Nahrul", "Pollob");
        hashSet.print(hashSet.buckets);
    }
}*/
/* 

import java.util.List;
import java.util.ArrayList;

class Pair {
    int key;
    String value;

    Pair(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

public class z_practice {

    static class SimpleHashMap {
        int size;
        List<List<Pair>> buckets;

        SimpleHashMap(int size) {
            this.size = size;
            this.buckets = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                buckets.add(new ArrayList<>());
            }
        }

        int hashFunction(int key) {
            String myKey = String.valueOf(key);
            int sum = 0;
            for (char c : myKey.toCharArray()) {
                sum += c;
            }
            return sum % size;
        }

        void put(int key, String value) {
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

        String get(int key) {
            int index = hashFunction(key);
            List<Pair> bucket = buckets.get(index);

            for (Pair pair : bucket) {
                if (pair.key == key) {
                    return pair.value;
                }
            }
            return null;
        }

        void delete(int key) {
            int index = hashFunction(key);
            List<Pair> bucket = buckets.get(index);
            bucket.removeIf(pair -> pair.key == key);
        }

        void print() {
            for (List<Pair> bucket : buckets) {
                if (bucket.isEmpty()) {
                    System.out.println("[]");
                    continue;
                }
                bucket.forEach(pair -> System.out.print("[" + pair.key + " " + pair.value + "] "));
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

        hashMap.delete(48);
        hashMap.print();
        // System.out.println(hashMap.get(48));
    }
}*/
/* 
import java.util.List;
import java.util.ArrayList;

class Pair {
    int key;
    String value;

    Pair(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

public class z_practice {

    static class SimpleHashMap {
        int size;
        List<List<Pair>> buckets;

        SimpleHashMap(int size) {
            this.size = size;
            this.buckets = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                buckets.add(new ArrayList<>());
            }
        }

        int hashFunction(int key) {
            int sum = 0;
            while (key > 0) {
                sum += key % 10;
                key /= 10;
            }
            return sum % size;
        }

        void put(int key, String value) {
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

        String get(int key) {
            int index = hashFunction(key);
            List<Pair> bucket = buckets.get(index);

            for (Pair pair : bucket) {
                if (pair.key == key) {
                    return pair.value;
                }
            }

            return null;
        }

        void delete(int key) {
            int index = hashFunction(key);
            List<Pair> bucket = buckets.get(index);
            bucket.removeIf(pair -> pair.key == key);
        }

        void print() {
            for (List<Pair> bucket : buckets) {
                if (bucket.isEmpty()) {
                    System.out.println("[]");
                    continue;
                }
                bucket.forEach(pair -> System.out.print("[" +pair.key + " " + pair.value + "] "));
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        SimpleHashMap hashMap = new SimpleHashMap(10);
        hashMap.put(1, "Samiul");
        hashMap.put(2, "Nawshin");
        hashMap.put(3, "Simanto");
        hashMap.put(4, "Ruhi");
        hashMap.put(5, "Fahim");
        hashMap.put(8, "Murad");
        hashMap.put(9, "Ashiqur");
        hashMap.put(14, "Alim");
        hashMap.put(16, "Rabbi");

        hashMap.print();
    }
}*/

