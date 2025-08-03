package Data_Structure.Hash_Tables;

import java.util.LinkedList;

public class z_practice2 {

    @SuppressWarnings("unchecked")
    static LinkedList<String>[] myHashSet = new LinkedList[10];

    static int hashFunction(String value) {
        int sum = 0;
        for (char c : value.toCharArray()) {
            sum += c;
        }

        return sum % 10;
    }

    static void add(String value) {
        int index = hashFunction(value);
        LinkedList<String> bucket = myHashSet[index];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    static void delete(String value) {
        int index = hashFunction(value);
        LinkedList<String> bucket = myHashSet[index];
        if (bucket.contains(value)) {
            bucket.remove(value);
        }
    }

    static void print(LinkedList<String>[] myHashSet) {
        for (LinkedList<String> bucket : myHashSet) {
            System.out.println(bucket);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < myHashSet.length; i++) {
            myHashSet[i] = new LinkedList<>();
        }

        add("Alim");
        add("Rabbi");
        add("Munna");
        add("Sabid");
        add("Pollob");
        add("Murad");
        add("Ashiqur");
        add("Arif");

        print(myHashSet);
        
        delete("Ashiqur");
        print(myHashSet);
    }
}
