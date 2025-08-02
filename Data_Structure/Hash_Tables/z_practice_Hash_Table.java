package Data_Structure.Hash_Tables;

public class z_practice_Hash_Table {

    static String[] str = new String[10];

    static int hashFunction(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c;
        }
        return sum % 10;
    }

    public static void main(String[] args) {
        int index = hashFunction("Bob");
        str[index] = "Bob";
        
        System.out.println(str[index]);
    }
}
