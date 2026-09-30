package org.example;


public class Main {
    static void main() {
        char[] chars = "J@va the be$t!123".toCharArray();
        char[] resultChar = replaceText(chars);
        System.out.println(resultChar);
    }

    public static char[] replaceText(char[] chars) {
        if (chars == null) {
            return new char[0];
        }
        if (chars.length == 0) {
            return chars;
        }

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char firstChar;
            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }
            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }
            firstChar = chars[left];
            chars[left] = chars[right];
            chars[right] = firstChar;
            left++;
            right--;
        }
        return chars;
    }

}

