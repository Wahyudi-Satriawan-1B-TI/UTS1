import java.util.Scanner;
public class UTS_25_Wahyudi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int gelas25;
double esTeh25 = 5000.0, esTehJumbo25 = 8000.0, diskon25 = 0.01, totalHarga25;
String id25;
boolean jenisTeh25, es25;
do {
    System.out.print("Masukkan ID pelanggan (5 digit) (Ketik 'selesai' untuk keluar) : ");
    id25 = sc.nextLine();
    if (id25.equalsIgnoreCase("selesai")) {
        System.out.println("Stand telah ditutup.");
        break;
    }
    System.out.print("Masukkan jumlah gelas: ");
    if (sc.hasNextInt()) {
        gelas25 = sc.nextInt();
    } else {
        System.out.println("Input tidak valid! Masukkan angka.");
        System.out.println("SILAHKAN MULAI ULANG PROGRAM.");
        sc.next();
        System.out.println();
        continue;
    }
        
    sc.nextLine();
    
    System.out.print("Apakah es teh jumbo (true/false)?: ");
    if (sc.hasNextBoolean()) {
        jenisTeh25 = sc.nextBoolean();
    } else {
        System.out.println("Input tidak valid! Masukkan 'true' atau 'false'.");
        System.out.println("SILAHKAN MULAI ULANG PROGRAM.");
        sc.next();
        System.out.println();
        continue;
    }
    System.out.print("Tambahan Es (true/false)?: ");
    es25 = sc.nextBoolean();
    
    if (id25.charAt(0) == '8') {
        if (jenisTeh25 == true) {
            if (es25 == true) {
                totalHarga25 = (esTehJumbo25 * gelas25) - ((esTehJumbo25 * gelas25) *diskon25);
                totalHarga25 -= 500.0;
            } else {
            totalHarga25 = (esTehJumbo25 * gelas25) - ((esTehJumbo25 * gelas25) *diskon25);
            }
        } else {
            if (es25 == true) {
            totalHarga25 = (esTeh25 * gelas25) - ((esTeh25 * gelas25) *diskon25);
            totalHarga25 -= 500.0;
            } else {
            totalHarga25 = (esTeh25 * gelas25) - ((esTeh25 * gelas25) *diskon25);
            }
        }
    } else {
        if (jenisTeh25 == true) {
            if (es25 == true) {
            totalHarga25 = (esTehJumbo25 * gelas25);
            totalHarga25 -= 500.0;
            } else {
            totalHarga25 = (esTehJumbo25 * gelas25);
            }
        } else {
            if (es25 == true) {
            totalHarga25 = (esTeh25 * gelas25);
            totalHarga25 -= 500.0;
            } else {
            totalHarga25 = (esTehJumbo25 * gelas25);
            }
        }
    }
System.out.println("====================================");
System.out.println("Jumlah gelas: " + gelas25);
if (jenisTeh25 = true) {
    System.out.println("Jenis es teh: Es teh jumbo");
} else {
    System.out.println("Jenis es teh: Es teh standar");
}
System.out.println("Total harga: Rp " + totalHarga25);
System.out.println("====================================");
sc.nextLine();

} while (true);
System.out.println("Semua transaksi selesai.");
sc.close();
    }
}