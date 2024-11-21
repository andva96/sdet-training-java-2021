package algorithms;

/**
 * Palindrome class contains two methods that allows to check if a given word is a palindrome or not.
 */
public class Palindrome {

    /**
     * Allows to determine if a given word or sentence is a palindrome or not by comparing the current inputString with its inverted equivalent.
     *
     * @param inputString corresponds to the word that will be evaluated.
     * @return true if the word is a palindrome and false if it is not.
     */
    public boolean checkPalindrome(String inputString) {
        if (inputString == null) return false;
        String wordWithoutSpaces = deleteSpacesForGivenString(inputString.toLowerCase());
        return new StringBuilder().append(wordWithoutSpaces).reverse().toString().equals(wordWithoutSpaces);
    }

    /**
     * Deletes the spaces for a given word.
     *
     * @param inputString corresponds to the word or sentence where the spaces will be deleted.
     * @return the word without spaces.
     */
    private String deleteSpacesForGivenString(String inputString) {
        return inputString.replaceAll("\\s", "");
    }

}


