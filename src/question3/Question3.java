package question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a + b;
        int sub = (a > b) ? a - b : b - a;
        int product = a * b;
        int qutionent = a / b;
        int reminder = a % b;
        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + qutionent);
        System.out.println(a + " % " + b + " = " + reminder);
    }

}
