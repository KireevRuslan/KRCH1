package org.example.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.replaceText;

public class MainTest {

    @Test
    public void replaceText_shouldReplaceChar_ifHaveChar() {
        char[] resultChar = replaceText("J@va the be$t!123".toCharArray());
        Assertions.assertArrayEquals("t@eb eht av$J!123".toCharArray(), resultChar);
    }

    @Test
    public void replaceText_shouldReturnEmpty_whenCharEmpty() {
        char[] resultChar = replaceText("".toCharArray());
        Assertions.assertArrayEquals("".toCharArray(), resultChar);
    }

    @Test
    public void replaceText_shouldReturnSingleChar() {
        char[] resultChar = replaceText("a".toCharArray());
        Assertions.assertArrayEquals("a".toCharArray(), resultChar);
    }

    @Test
    public void replaceText_shouldReturnUnmodifinetArray() {
        char[] resultChar = replaceText("123 !@#".toCharArray());
        Assertions.assertArrayEquals("123 !@#".toCharArray(), resultChar);
    }

    @Test
    public void replaceText_shouldReturnReversedArray() {
        char[] resultChar = replaceText("abcd".toCharArray());
        Assertions.assertArrayEquals("dcba".toCharArray(), resultChar);
    }

    @Test
    public void replaceText_shouldReplaceOnlyLettersNotLocatedEdgeCenter() {
        char[] resultChar = replaceText("@b#d$".toCharArray());
        Assertions.assertArrayEquals("@d#b$".toCharArray(), resultChar);
    }

    @Test
    public void replaceText_shouldSaveLetterCase() {
        char[] resultChar = replaceText("@B#d$".toCharArray());
        Assertions.assertArrayEquals("@d#B$".toCharArray(), resultChar);
    }

    @Test
    public void replaceText_shouldReturnZeroLenghtArray_whenNull() {
        char[] resultChar = replaceText(null);
        Assertions.assertArrayEquals(new char[0], resultChar);
    }
}
