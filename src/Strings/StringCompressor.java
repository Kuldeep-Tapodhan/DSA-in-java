package Strings;

public class StringCompressor {
    public static void compress(char[] chars) {
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                System.out.print(chars[i - 1]);
                if (count > 1) {
                    System.out.print(count);
                }
                count = 1;
            }
        }

        // Print the last character group
        System.out.print(chars[chars.length - 1]);
        if (count > 1) {
            System.out.print(count);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        char[] input = "aaabbcccdee".toCharArray();
        compress(input);
    }
}