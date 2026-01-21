package StringPrograms;

public class Test2 {
	    public static boolean isPangram(String str) {
	        if (str == null || str.length() == 0) {
	            return false;
	        }
	        
	        // Create an array to track occurrences of each letter
	        boolean[] alphabetTracker = new boolean[26];
	        int uniqueLetterCount = 0;

	        // Convert the string to lowercase manually
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Convert to lowercase if the character is uppercase
	            if (ch >= 'A' && ch <= 'Z') {
	                ch = (char) (ch + ('a' - 'A'));
	            }

	            // Check if it's a lowercase alphabet
	            if (ch >= 'a' && ch <= 'z') {
	                int index = ch - 'a'; // Calculate the index for the letter
	                if (!alphabetTracker[index]) {
	                    alphabetTracker[index] = true;
	                    uniqueLetterCount++;
	                }
	            }

	            // If all 26 letters are found, return true
	            if (uniqueLetterCount == 26) {
	                return true;
	            }
	        }

	        return false; // Not all letters were found
	    }

	    public static void main(String[] args) {
	        String test = "The quick brown fox jumps over the lazy dog@!#!@#";
	        System.out.println("Is Pangram? " + isPangram(test));
	    }
	}


