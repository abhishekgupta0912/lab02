package question4;

import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0)
            System.out.println("positive");
        else if (a < 0)
            System.out.println("negative");
        else if (a == 0)
            System.out.println("zero");

    }
}
