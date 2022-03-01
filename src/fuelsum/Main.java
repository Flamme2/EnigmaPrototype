package fuelsum;
// Import the HashMap class
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    // array of alphabet
    static  char[] Alphabet = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
    // using dictionary to map alphabet to int value
    static HashMap<Character, Integer> DataTable = new HashMap<Character, Integer>();
    static int counter;

    public static void main(String[] args) {

        // Populate dataTable
        for(int i = 0 ; i <= Alphabet.length - 1; i++){
            counter++;
            char tempChar = Alphabet[i];
            DataTable.put(tempChar, counter);
        }
        System.out.println(Arrays.asList(DataTable) + "\n");
        //System.out.println(DataTable.get('b'));
        int tempVal = MapCharToInt('w');
        System.out.println(tempVal);


    }


    private static int MapCharToInt(char value){
        int result = (DataTable.get(value));
        return result;
    }



}
