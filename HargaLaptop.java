import java.util.Scanner;
public class HargaLaptop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get laptop price from user
        System.out.print("Masukkan harga laptop: ");
        double laptopPrice = scanner.nextDouble();

        // Get installment duration from user
        System.out.print("Masukkan lama angsuran (bulan): ");
        int installmentDuration = scanner.nextInt();

        // Calculate total installment based on price and duration
        double totalInstallment = 0;
        if (laptopPrice >= 20000000) {
            switch (installmentDuration) {
                case 3:
                    totalInstallment = laptopPrice / 3 + (laptopPrice * 0.005);
                    break;
                case 6:
                    totalInstallment = laptopPrice / 6 + (laptopPrice * 0.01);
                    break;
                case 12:
                    totalInstallment = laptopPrice / 12 + (laptopPrice * 0.02);
                    break;
                default:
                    System.out.println("Salah masukan bulan");
                    break;
            }
        } else if (laptopPrice >= 5000000) {
            switch (installmentDuration) {
                case 3:
                    totalInstallment = laptopPrice / 3 + (laptopPrice * 0.005);
                    break;
                case 6:
                    totalInstallment = laptopPrice / 6 + (laptopPrice * 0.01);
                    break;
                case 12:
                    totalInstallment = laptopPrice / 12 + (laptopPrice * 0.02);
                    break;
                default:
                    System.out.println("Salah masukan bulan");
                    break;
            }
        } else {
            System.out.println("Maaf, laptop dengan harga di bawah 5 juta tidak dapat diangsur.");
        }

        // Display total installment
        if (totalInstallment > 0) {
            System.out.printf("Total angsuran untuk laptop dengan harga Rp%.2f selama %d bulan adalah Rp%.2f", laptopPrice, installmentDuration, totalInstallment);
        }
    }
}
