import java.util.Scanner;

public class reverse {
    Scanner sc = new Scanner(System.in);
    void rec(int n) {
        int a = sc.nextInt();
        if(n == 1) {
            System.out.println(a);
            return ;
        }
        rec(n - 1);
        System.out.println(a);
    }

    void main() {
        int n = sc.nextInt();
        rec(n);
    }
}
