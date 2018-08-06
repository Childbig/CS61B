package proj1b;

import project1A.LinkedListDeque;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/6
 *  Last updated:  2018/8/6
 *  Compilation:   javac Palindrome.java
 *  Description: 
 *
 ******************************************************************************/


public class Palindrome {
    public Deque<Character> wordToDeque(String word) {
        Deque<Character> deque = new LinkedListDeque<>();


        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        return deque;
    }

    public boolean isPalindrome(String word) {
        Deque<Character> deque = wordToDeque(word);

        String palindromeWord = "";
        for (int i = deque.size() - 1; i >= 0; i--) {
            palindromeWord += String.valueOf(deque.get(i));
        }

        return palindromeWord.equals(word);
    }

    public boolean isPalindromeRecursion(String word) {
        return word.equals(helpPalindrome(word));
    }
    private String helpPalindrome(String word) {
        while (word.length() == 0 && "".equals(word)) {
            return "";
        }
        return  word.charAt(word.length() - 1) + helpPalindrome(word.substring(0, word.length() - 1));
    }

    public boolean isPalindrome(LinkedListDeque<Character> word, CharacterComparator cc) {
        return false;
    }


    public boolean isPalindrome(String word, CharacterComparator cc) {
        return false;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome("123");
    }
}
