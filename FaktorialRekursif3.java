public class FaktorialRekursif3 {
    public static long faktorial(long N) {
        if (N <= 1) {
            return 1;
        } else {
            long hasil = N * faktorial(N - 1);
            System.out.println("Faktorial " + N + " = " + hasil);
            return hasil;
        }
    }
    public static void main(String[] args) {
        faktorial(5);
    }
}