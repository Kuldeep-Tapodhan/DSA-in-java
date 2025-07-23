package Strings;

public class ReverseEachWord {

    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();
        String input = "hello this is deep tapodhan";
        int j = 0;

        for (int i = 0; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) == ' ') {
                String word = input.substring(j, i);
                StringBuilder reversedWord = new StringBuilder(word).reverse();
                result.append(reversedWord);
                if (i != input.length()) {
                    result.append(" ");
                }
                j = i + 1;
            }
        }

        System.out.println(result.toString());
    }
}
