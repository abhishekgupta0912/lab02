
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
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + "=" + a * i);

        }
    }
}
