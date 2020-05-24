package task_palindrome;

/**
   A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
   such as madam, racecar. There are also numeric palindromes, including date/time stamps using short digits 11/11/11 11:11
   and long digits 02/02/2020. Sentence-length palindromes may be written when allowances are made for adjustments to capital letters,
   punctuation, and word dividers, such as "A man, a plan, a canal, Panama!".
*/

public class Answer {
    public static void checkPalindrome(StringBuilder inWord) {
        StringBuilder revWord = new StringBuilder(inWord);
        String strInWord = inWord.toString();
        String strRevWord = revWord.toString();

        if(strInWord.toUpperCase().equals(strRevWord.toUpperCase())) {
            System.out.print("Word " + inWord + " - palindrome");
        } else {
            System.out.print("Word " + inWord + " - not palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrome(new StringBuilder("abBA"));
    }
}
