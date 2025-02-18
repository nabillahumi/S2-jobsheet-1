public class MahasiswaMain18 {
    public static void main(String[] args) {
        // Instansiasi object dari kelas Mahasiswa19
        Mahasiswa18 mhs1 = new Mahasiswa18();

        // Mengakses atribut secara langsung
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "22417020171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa18 mhs2 = new Mahasiswa18("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa18 mhsBilla = new Mahasiswa18("Nabillah Umi Purnama", "244107020054", 3.25, "TI 1F");
        mhsBilla.updateIpk(3.75);
        mhsBilla.tampilkanInformasi();
    }
}
