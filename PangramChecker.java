package varun;

public class PangramChecker {
    public static boolean isPangram(String input) {
        // Create a boolean array to track the presence of each letter from 'a' to 'z'
        boolean[] isLetterPresent = new boolean[26];
        
        // Convert the input to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();
        
        // Iterate through the input and mark letters as present in the boolean array
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                isLetterPresent[c - 'a'] = true;
            }
        }
        
        // Check if all letters from 'a' to 'z' are present
        for (boolean letterPresent : isLetterPresent) {
            if (!letterPresent) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String testString = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(testString);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

