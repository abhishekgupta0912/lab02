
package Main;

import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        One ab = new One();
        ab.input(n);

    }

    void input(int a) {
        if (a % 400 == 0 || a % 4 == 0)
            System.out.println("leap year");
        else
            System.out.println("not a leap year");
    }
}
