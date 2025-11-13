import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        String [][] penonton = new String [4] [2];
        int menu, baris, kolom;
        String nama, next;

        while (true) {
            System.out.println("\n== MENU BIOSKOP == ");
            System.out.println("1. Input data penonton ");            
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Posisi kursi tidak valid!");
                        } else if (penonton[baris - 1][kolom -  1] != null) {
                            System.out.println("Kursi sudah terisi!");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil disimpan!");
                            break;
                        }
                    }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                
                case 2:
                    System.out.println("\nDaftar Penonton");
                    for(int i = 0; i < 4; i++) {
                        for(int j = 0; j < 2; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("[ *** ]\t");
                            } else {
                                System.out.print("[" + penonton[i][j] + "]\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                System.out.println("Terima kasih! Program selesai.");
                sc.close();
                return;

                default:
                    System.out.println("Menu tidak valid! silahkan pilih 1-3");
                    break;
            }
        }
 
    }
}