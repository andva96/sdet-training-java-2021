package algorithms.tests.firstchallenge;

import algorithms.Palindrome;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {

    private Palindrome pal = new Palindrome();

    /**
     * Basic test to validate the correct functionality of Palindrome with valid Palindromes.
     */
    @Test
    public void validateRealPalindromeReturnsTrue() {
        Assert.assertTrue(pal.checkPalindrome("anitalavalatina"));
    }

    /**
     * Basic test to validate the correct functionality of Palindrome when there is a palindrome with spaces.
     */
    @Test
    public void validatePalindromeWithSpacesReturnsTrue() {
        Assert.assertTrue(pal.checkPalindrome("anita lava la tina"));
    }

    /**
     * Basic test to validate the correct functionality of Palindrome when a word is not a palindrome.
     */
    @Test
    public void validateANonPalindromeReturnsFalse() {
        Assert.assertFalse(pal.checkPalindrome("andrea"));
    }

    /**
     * Basic test to validate the correct functionality of Palindrome when there are capital letters.
     */
    @Test
    public void validatePalindromeWithCapitalLettersReturnsTrue() {
        Assert.assertTrue(pal.checkPalindrome("AnitaLava LA tina"));
    }

    /**
     * Basic test to validate the correct functionality of Palindrome with numbers.
     */
    @Test
    public void validatePalindromeWithNumbersReturnsTrue() {
        Assert.assertTrue(pal.checkPalindrome("123321"));
    }

    /**
     * Basic test to validate the correct functionality of Palindrome when null is sent.
     */
    @Test
    public void validatePalindromeWithNullReturnsFalse() {
        Assert.assertFalse(pal.checkPalindrome(null));
    }

}
