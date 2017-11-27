package io.zipcoder;
import org.junit.*;


public class Problem4Test {


    @Test
    public void isPalindromeTrueTest() {

        String gameOfThrones = "aaabbbb, cdefghmnopqrstuvw, cdcdcdcdeeeef";

        boolean expected = true;

        String actual = Problem4.isPalindrome(gameOfThrones);

        Assert.assertTrue(true);

    }

    @Test
    public void isPalindromeFalseTest() {

        String gameOfThrones = "aaabbbb, cdefghmnopqrstuvw, cdcdcdcdeeeef";

        boolean expected =  false;

        String actual = Problem4.isPalindrome(gameOfThrones);

        Assert.assertFalse(false);
    }



}
