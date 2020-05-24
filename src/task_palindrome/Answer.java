package task_palindrome;

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
