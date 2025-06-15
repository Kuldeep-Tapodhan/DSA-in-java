package realtimeApplicationPractice;/*
Implement a program to generate and display the next date of a given date.

The date will be provided as day, month and year as shown in the below table.

The output should be displayed in the format: day-month-year.

Assumption: The input will always be a valid date.
 */

import java.util.Scanner;

public class generatenextdate {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        day++;
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        System.out.println(day + "-" + month + "-" + year);
    }


}
