void rec(int n) {
    if(n == 0) return ;
    rec(n / 10);
    System.out.println(n % 10);
}

void main() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    rec(n);
}
