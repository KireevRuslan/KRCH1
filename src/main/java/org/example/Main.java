package org.example;


public class Main {
    static void main() {
        char[] chars = "J@va the be$t!123".toCharArray();
        int left = 0;
        int right = chars.length - 1;
        int a;

        while (left < right) {
            char firstChar = chars[left];
            if (Character.isLetter(chars[left])){
                a = 1;
            } else {
                left++;
                a = 0;
            }
            if (a == 1){
                if (Character.isLetter(chars[right])){
                    chars[left] = chars[right];
                    chars[right] = firstChar;
                    right--;
                    left++;
                } else {
                    right--;
                }
            } else {}



        }

        System.out.println(new String(chars));

    }
}
