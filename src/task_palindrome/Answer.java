package task_palindrome;

/**
   A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
   such as madam, racecar. There are also numeric palindromes, including date/time stamps using short digits 11/11/11 11:11
   and long digits 02/02/2020. Sentence-length palindromes may be written when allowances are made for adjustments to capital letters,
   punctuation, and word dividers, such as "A man, a plan, a canal, Panama!".
*/

public class Answer {

    public static void checkPalindrome(String inWord) {
        String outWord = new String(inWord);
        String symbol = ".,?!()/";

        for(char delSymbol : symbol.toCharArray()) {
            inWord = inWord.replace(delSymbol, ' ');
        }

        String temp = inWord.replace(" ", "").toUpperCase();

        int startLine = 0;
        int endLine = temp.length() - 1;
        boolean check = true;
        while(startLine < endLine) {
            if(temp.charAt(startLine) != temp.charAt(endLine)) {
                check = false;
                break;
            } else {
                startLine++;
                endLine--;
            }
        }
        if(!check) {
            System.out.println("Phrase: " + outWord + " - not palindrome");
       } else System.out.println("Phrase: " + outWord + " - palindrome");
}


    public static void main(String[] args) {
        new Answer();
        Answer.checkPalindrome("A man, a plan, a canal, Panama!");
    }
}
