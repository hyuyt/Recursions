import java.util.Scanner;

public class prime_num {

    boolean prime(int n, int a) {
        if(n == a) return true;
        if(n % a == 0) return false;
        if(n < a * a) return true;
        return prime(n, a + 1);
    }

    void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(prime(n, 2)) System.out.println("Prime");
        else System.out.println("Composite");
    }
}
