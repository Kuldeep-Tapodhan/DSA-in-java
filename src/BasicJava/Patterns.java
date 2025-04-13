package BasicJava;
import java.util.Scanner;

public class Patterns {

    // Function for full rectangle pattern
    // ******
    // ******
    // ******
    public static void fullRectangle(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Function for hollow rectangle pattern
    // ******
    // *    *
    // *    *
    // ******
    public static void hollowRectangle(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Function for right triangle pattern
    // *
    // **
    // ***
    // ****
    // *****
    public static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Function for inverted right triangle pattern
    // *****
    // ****
    // ***
    // **
    // *
    public static void invertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Function for pyramid pattern
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Function for number pattern
    // 1234567
    // 2345671
    // 3456712
    // 4567123
    // 5671234
    // 6712345
    // 7123456
    public static void numberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    // Function for continuous number pattern
    // 1234567
    // 1234567
    // 1234567
    // 1234567
    // 1234567
    public static void continuousNumberPattern(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Function for alternating 1 and 2 pattern
    // 12121
    // 21212
    // 12121
    // 21212
    public static void alternatingPattern(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if ((i + j) % 2 != 0) {
                    System.out.print("2");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    // Function for increasing number pattern
    // 1
    // 12
    // 123
    // 1234
    // 12345
    public static void increasingNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Function for number pyramid pattern
    //     1
    //    123
    //   12345
    //  1234567
    // 123456789
    public static void numberPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    // Function for diamond pattern
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Function for Pascal's triangle
    // 1
    // 1 1
    // 1 2 1
    // 1 3 3 1
    // 1 4 6 4 1
    public static void pascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // Function for hourglass pattern
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    public static void hourglass(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Function for Floyd's triangle
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    public static void floydsTriangle(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    // Function for zig-zag pattern
    //    *       *
    //  *   *   *   *
    // *     *       *
    public static void zigzag(int n) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        fullRectangle(n, m);
        hollowRectangle(n, m);
        rightTriangle(n);
        invertedRightTriangle(n);
        pyramid(n);
        numberPattern(n);
        continuousNumberPattern(n);
        alternatingPattern(n, m);
        increasingNumberPattern(n);
        numberPyramidPattern(n);
        diamond(n);
        pascalsTriangle(n);
        hourglass(n);
        floydsTriangle(n);
        zigzag(n);

        sc.close();
    }
}
