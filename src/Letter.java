import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Letter {

    // Recursive function to generate 
    // all permutations of string s
    static void arrangeletters(int index, StringBuilder s, List<String> letters) {

        // Base Case
        if (index == s.length()) {
            letters.add(s.toString());
            return;
        }

        // Swap the current index with all
        // possible indices and recur
        for (int i = index; i < s.length(); i++) {
            swap(s, index, i);
            arrangeletters(index + 1, s, letters);
            swap(s, index, i);
        }
    }

    // Swap characters at positions i and j
    static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }

    // Function to find all unique permutations
    static List<String> findPermutation(String s) {

        // Stores the final letterswer
        List<String> letters = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);

        arrangeletters(0, str, letters);

        // sort the resultant list
        Collections.sort(letters);

        return letters;
    }

    public static void main(String[] args) {
        String s = "ABC";
        List<String> res = findPermutation(s);
        for (String x : res) {
            System.out.print(x + " ");
        }
    }
}