package onboarding;

public class Problem4 {
    private static boolean isLowerCase(char letter) {
        return letter >= 'a' && letter <= 'z';
    }
    private static boolean isUpperCase(char letter) {
        return letter >= 'A' && letter <= 'Z';
    }
    private static char transform(char letter) {
        if (isLowerCase(letter)) {
            return (char) ('a'+'z'-letter);
        }
        if (isUpperCase(letter)) {
            return (char) ('A'+'Z'-letter);
        }
        return letter;
    }
    public static String solution(String word) {
        String answer = "";
        return answer;
    }
}
