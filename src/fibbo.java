import java.util.Scanner;

public class fibbo {
    int f(int a, int b, int n) {
        if(n == 0) return b;
        return f(b, b + a, n - 1);
    }

    void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(1, 1, n - 2));
    }
}
