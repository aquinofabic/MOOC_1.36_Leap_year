
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = scan.nextInt();

        if (year % 100 == 0 && !(year % 400 == 0)) {
            System.out.println("This year is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
    }
}

// EXECUTION OF ORDER OF CONDITIONAL STATEMENTS
/*
https://java-programming.mooc.fi/part-1/6-conditional-statements

Make sure that the parsing of conditional statements is correct.
- The fizz buzz example shows that we must develop code that meets the MOST DEMANDING CONDITION FIRST!

Train of thought
1. Write a program that reads input from the user.
2. If the number is divisible by both three and five, then print "FizzBuzz" instead of the number.
3. If the number is divisible by three, then print "Fizz" instead of the number.
4. If the number is divisible by five, then print "Buzz" instead of the number.
5. Otherwise, the program prints the number given by the user.

- Otherwise, if 3. was first, the input 15 would print "Fizz" and not "FizzBuzz"
 */

