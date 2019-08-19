package question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))
            System.out.println("alphabet");
        else if (a >= 47 && a <= 57)
            System.out.println("digit");
        else
            System.out.println("special character");
    }
}
