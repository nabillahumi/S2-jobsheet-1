public class Dosen18 {
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen18() {

    }
    public Dosen18(String ID, String nm, boolean status, int tahun, String bidang){
        idDosen = ID;
        nama = nm;
        statusAktif = status;
        tahunBergabung = tahun;
        bidangKeahlian = bidang;
    }
        
    void tampilInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Aktif/Tidak: " + statusAktif);
        System.out.println("Bergabung pada tahun: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
        System.out.println("----------------------------------------");
    }
    
    void setStatusAktif(boolean statusBaru){
        statusAktif = statusBaru;
    }
    
    void hitungMasaKerja(int thnSekarang) {
        int masaKerja = thnSekarang - tahunBergabung;
        System.out.println("Masa bekerja Dosen : " + masaKerja + "tahun");
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
