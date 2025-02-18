public class MataKuliahMain18 {
    
    public static void main(String[] args) {
        MataKuliah18 mk1 = new MataKuliah18();
        mk1.kodeMK = "1FALSD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(5);
        mk1.tambahJam(4);
        mk1.kurangJam(2);
        mk1.tampilkanInformasi();

        MataKuliah18 mk2 = new MataKuliah18("BDTI", "Basis Data", 3, 7 );
        mk2.tambahJam(4);
        mk2.tampilkanInformasi();

        MataKuliah18 mk3 = new MataKuliah18("SISOPTI", "Sistem Operasi", 5, 8 );
        mk3.tambahJam(3);
        mk3.tampilkanInformasi();
    }
}
