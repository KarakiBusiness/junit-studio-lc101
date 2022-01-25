package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test public void onlyBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("Launchcode"));
    }

    @Test
    public void unbalancedBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[unbalanced"));
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void invertedBrackets(){
//        assertFalse(main.BalancedBrackets.hasBalancedBrackets("]Lions["));
//    }

    @Test
    public void nullString(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void excessiveBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[Lions]["));
    }

    @Test
    public void doubleBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[[does it work?]]"));
    }

    @Test
    public void rightSideBracket(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("it work?]"));
    }

    @Test
    public void leftSideBracket(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[it work?"));
    }

//    @Test(expected=IllegalArgumentException.class)
//    public void invertedBrackets2(){
//        assertNotEquals(main.BalancedBrackets.hasBalancedBrackets("] work?["));
//    }

    @Test
    public void midBracket(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("Tee[mo sucks]"));
    }

    @Test
    public void doubleLeftSideBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("Tee[[mo sucks"));
    }

    @Test
    public void doubleRightSideBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("Tee mo Sucks]]"));
    }


}
