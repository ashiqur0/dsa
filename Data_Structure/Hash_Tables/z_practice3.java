package Data_Structure.Hash_Tables;

import java.util.LinkedList;

public class z_practice3 {

    int size;
    LinkedList<String>[] myHashSet;

    @SuppressWarnings("unchecked")
    z_practice3(int size) {
        this.size = size;
        myHashSet = new LinkedList[size];
    }

    public int hashFunction(String data) {
        int sum = 0;
        for (char c : data.toCharArray()) {
            sum += c;
        }

        return sum % size;
    }

    public void add(String name) {
        int index = hashFunction(name);
        LinkedList<String> bucket = myHashSet[index];
        if (!bucket.contains(name)) {
            bucket.add(name);
        }
    }

    public void delete(String name) {
        int index = hashFunction(name);
        LinkedList<String> bucket = myHashSet[index];
        if (bucket.contains(name)) {
            bucket.remove(name);
        }
    }

    public boolean search(String name) {
        int index = hashFunction(name);
        LinkedList<String> bucket = myHashSet[index];
        if (bucket.contains(name)) {
            return true;
        }
        return false;
    }

    public void update(String name, String newName) {
        int index = hashFunction(name);
        LinkedList<String> bucket = myHashSet[index];
        int position = bucket.indexOf(name);
        if (position != -1) {
            bucket.set(position, newName);
        }
    }

    public void print(LinkedList<String>[] myHashSet) {
        for(LinkedList<String> bucket : myHashSet) {
            System.out.println(bucket);
        }
    }
    
    public static void main(String[] args) {
        z_practice3 hashTable = new z_practice3(10);

        for (int i = 0; i < hashTable.myHashSet.length; i++) {
            hashTable.myHashSet[i] = new LinkedList<>();
        }

        hashTable.add("Murad");
        hashTable.add("Ashiqur");
        hashTable.add("Alim");
        hashTable.add("Rabbi");
        hashTable.add("Munna");
        hashTable.add("Sabid");
        hashTable.add("Pollob");
        hashTable.add("Arif");

        hashTable.print(hashTable.myHashSet);
        hashTable.delete("Ashiqur");
        hashTable.print(hashTable.myHashSet);

        System.out.println(hashTable.search("Ashiqur"));
        hashTable.update("Pollob", "AAAA");

        hashTable.print(hashTable.myHashSet);
    }
}