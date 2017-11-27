package io.zipcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

    public static String isPalindrome(String gameOfThrones) {

        int oddNumbers = 0;
        int evenNumbers = 0;
        int characterNumbers= 0;

        Map<Character, Integer> map = new HashMap<>();

        for (Character i : gameOfThrones.toCharArray()) {

            int count = map.containsKey(i) ? map.get(i) + 1 : 1;
            map.put(i, count);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                evenNumbers++;
            } else {
                if (oddNumbers == 1) return "NO";
                oddNumbers++;
            }
            characterNumbers++;
        }
        if (gameOfThrones.length() % 2 == 0) {
            return characterNumbers == evenNumbers ? "YES" : "NO";
        } else {
            return oddNumbers == 1 ? "YES" : "NO";
        }
    }


// If using scanner but breaks test. It will work and tell whether palindrome or not.

//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String line = scanner.nextLine();
//    Map<Character, Integer> charMap = new HashMap<>();
//    for(int i = 0; i < line.length(); i++) {
//        char c = line.charAt(i);
//        int count = charMap.getOrDefault(c, 0);
//        charMap.put(c, count + 1);
//    }
//    System.out.println(isPalindrome(line.length(), charMap));
//    scanner.close();
//}
//
//    public static String isPalindrome(int length, Map<Character, Integer> charMap) {
//        boolean isPalindrome = true;
//        if(length % 2 == 0) {
//            for(char key : charMap.keySet()) {
//                if(charMap.get(key) % 2 != 0) {
//                    isPalindrome = false;
//                    break;
//                }
//            }
//        }
//        if(length % 2 != 0) {
//            int oddCount = 0;
//            for(char key : charMap.keySet()) {
//                if(charMap.get(key) % 2 != 0) {
//                    oddCount++;
//                }
//            }
//            isPalindrome = oddCount == 1;
//        }
//        if(isPalindrome) {
//            return "YES";
//        } else {
//            return "NO";
//        }
//    }
}

