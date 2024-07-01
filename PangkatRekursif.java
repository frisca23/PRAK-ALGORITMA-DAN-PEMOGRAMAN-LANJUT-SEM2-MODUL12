public class PangkatRekursif {
    public static long pangkat(long A, long B) {
        if (B == 0) {
            return 1;
        } else {
            return A * pangkat(A, B - 1);
        }
    }
    public static void main(String[] args) {
        long A = 5;
        long B = 3;
        long hasil = pangkat(A, B);
        System.out.println("Hasil pangkat " + A + " pangkat " + B + " = " + hasil);
    }
}