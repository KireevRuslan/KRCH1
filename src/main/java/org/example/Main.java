package org.example;


public class Main {
    static void main() {
        char[] chars = "J@va the be$t!123".toCharArray();
        char[] resultChar = replaceText(chars);
        System.out.println(resultChar);
    }

    public static char[] replaceText(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char firstChar;
            if (Character.isLetter(chars[left])) {
                if (Character.isLetter(chars[right])) {
                    firstChar = chars[left];
                    chars[left] = chars[right];
                    chars[right] = firstChar;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return chars;
    }

}

