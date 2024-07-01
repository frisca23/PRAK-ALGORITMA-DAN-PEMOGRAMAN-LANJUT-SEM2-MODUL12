public class Latihan2 {
    public static long gcd(long x, long y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
    public static void main(String[] args) {
        long x = 48;
        long y = 18;
        long gcd = gcd(x, y);
        System.out.println("GCD dari " + x + " dan " + y + " adalah: " + gcd);
    }
}