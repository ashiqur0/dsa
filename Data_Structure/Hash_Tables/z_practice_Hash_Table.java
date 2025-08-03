package Data_Structure.Hash_Tables;

public class z_practice_Hash_Table {

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

    static void add(String value) {
        int index = hashFunction(value);

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