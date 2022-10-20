/*
 * 1832. Check if the Sentence Is Pangram
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
*/


import java.util.HashSet;

class pangramOctober17 {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> alpha = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            alpha.add(ch);
        }
        if(alpha.size() == 26) return true;
        return false;
    }
}