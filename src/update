import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Letter {

    // Recursive function to generate 
    // all permutations of string s
    static void arrangeletters(int index, String[] letters, List<String> result) {

        // Base Case
        if (index == letters.length) {
            String temp = "";
            for(int x = 0; x < letters.length; x++)
            temp = temp + letters[x];
            
        result.add(temp);
        return;
        }

        // Swap the current index with all
        // possible indices and recur
        for (int i = index; i <letters.length; i++) {
            swap(index, letters, i);
            arrangeletters(index + 1, letters, result);
            swap(index, letters, i);
        }
    }

    // Swap characters at positions i and j
    static void swap(int i, String[] s,int j) {
        String temp = s[j];
        s[j] = s[i];
        s[i] = temp;
    }

    // Function to find all unique permutations
    static List<String> findPermutation( String[] letters) {

        // Stores the final letterswer
        List<String> result = new ArrayList<>();
     

        arrangeletters(0, letters, result);

        // sort the resultant list
        Collections.sort(result);

        return result;
    }

 
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C"};
         List<String> res = findPermutation(letters);
         for (String x : res) {
             System.out.print(x + " ");
         }
     }
 }
