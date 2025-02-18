public class MataKuliah18 {
    
    // deklarasi variabel
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah18() {

    }

    public MataKuliah18 (String kode, String nama, int sks, int jmlJam) {
        kodeMK = kode;
        this.nama = nama;
        this.sks = sks;
        jumlahJam = jmlJam;
    }
    void tampilkanInformasi() {
        System.out.println("Nama: " + kodeMK);
        System.out.println("NIM: " + nama);
        System.out.println("IPK " + sks);
        System.out.println("Kelas: "+ jumlahJam);
        System.out.println("-----------------------");
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi : " + sks);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam bertambah menjadi : " + jumlahJam);
    }

    void kurangJam(int jam) {
        if (jam > jumlahJam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berkurang menjadi : " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jumlah jam tidak mencukupi.");
        }
    }

}
