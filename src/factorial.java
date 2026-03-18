import java.util.Scanner;

public class factorial {
    int fact(int n) {
        if(n == 1) return n;
        return n * fact(n - 1);
    }

    void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
