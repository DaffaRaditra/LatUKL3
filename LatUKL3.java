import java.util.Scanner;

public class LatUKL3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Faktorial");
        int n;

        do {
            System.out.print("Masukkan bilangan bulat positif (Max nya 12) : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid. Harap masukkan bilangan bulat.");
                scanner.next(); 
                System.out.print("Masukkan bilangan bulat positif : ");
            }
            n = scanner.nextInt();
            if (n < 0 || n > 12) {
                System.out.println("Input harus dari 0 sampai 12.");
            }
        } while (n < 0 || n > 12);

        int hasilFaktorial = hitungFaktorial(n); 
        System.out.println("Faktorial dari " + n + " (" + n + "!) adalah " + hasilFaktorial + ".");

    }

    public static int hitungFaktorial(int bilangan) { 
        if (bilangan == 0) {
            return 1;
        }

        int hasil = 1;
        for (int i = 1; i <= bilangan; i++) {
            hasil = hasil * i;
        }
        return hasil;
    }
}