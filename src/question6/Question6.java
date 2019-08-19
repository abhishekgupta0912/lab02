package question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a1 = sc.nextLine().trim().charAt(0);
        char a2 = sc.nextLine().trim().charAt(0);
        if (a1 - a2 > 0)
            System.out.println(a2 + " " + a1);
        else
            System.out.println(a1 + " " + a2);

    }
}
