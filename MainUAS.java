
package tipedata;
    class Mahasiswa {

    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void displayInfo() {
        System.out.println("Nama \t: " + nama);
        System.out.println("Umur \t: " + umur);
    }
}

class MahasiswaBaru extends Mahasiswa {

    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public void displayInfo() {
        System.out.println("====Mahasiswa Baru====");
        super.displayInfo();
        System.out.println("Nim \t: " + nim + "\n");
    }

}

class MahasiswaLama extends Mahasiswa {

    private int angkatan;

    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void displayInfo() {
        System.out.println("====Mahasiswa Lama====");
        super.displayInfo();
        System.out.println("Ankatan\t: " + angkatan);
    }
}

public class MainUAS {

    public static void main(String[] args) {
        MahasiswaBaru maba = new MahasiswaBaru("Fatih Muzaqi", 22205026, 19);
        maba.displayInfo();

        MahasiswaLama mala = new MahasiswaLama("Fatih Muzaqi", 19, 2022);
        mala.displayInfo();
    }
}

