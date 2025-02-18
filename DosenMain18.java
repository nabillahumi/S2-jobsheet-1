public class DosenMain18 {

    public static void main(String[] args) {
        Dosen18 dsn1 = new Dosen18();
        dsn1.idDosen = "JTI18";
        dsn1.nama = "Nabillah Umi Purnama";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2020;
        dsn1.bidangKeahlian = "ALSD";
    
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("Basis Data");
        dsn1.tampilInformasi();
    
        Dosen18 dsn2 = new Dosen18("PJKR18", "Alghifari", true, 2015, "Statistika");
        dsn2.ubahKeahlian("Matematika");
        dsn2.tampilInformasi();

        Dosen18 dsn3 = new Dosen18("AKNT18", "Salsa", false, 2019, "Fisika");
        dsn3.ubahKeahlian("Kimia");
        dsn3.tampilInformasi();
    }
    
}
