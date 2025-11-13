import java.util.Scanner;
public class Tugas08 {
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in); 
    
        int responden = 10;
        int pertanyaan = 6;
        int[][] hasil = new int[responden][pertanyaan];

        System.out.println("=== Input Hasil Survei Kepuasan Pelanggan ===");

        for (int i = 0; i < responden; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Nilai untuk pertanyaan ke-" + (j + 1) + " (1-5): ");
                hasil[i][j] = sc.nextInt();

                while (hasil[i][j] < 1 || hasil[i][j] > 5) {
                    System.out.print("Nilai tidak valid! Masukkan antara 1-5: ");
                    hasil[i][j] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += hasil[i][j];
            }
            double rata = total / pertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata);
        }

        System.out.println("\n=== Rata-rata per Pertanyaan ===");
        for (int j = 0; j < pertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < responden; i++) {
                total += hasil[i][j];
            }
            double rata = total / responden;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
            totalKeseluruhan += hasil[i][j];
            }
        }

        double rataKeseluruhan = totalKeseluruhan / (responden * pertanyaan);
        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.println("Nilai rata rata keseluruhan: " + rataKeseluruhan);
        sc.close();
    }
}
