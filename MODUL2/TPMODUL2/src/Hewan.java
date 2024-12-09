public class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void suara() {
        System.out.println(nama + " mengeluarkan suara.");
    }

    public void makan() {
        System.out.println(nama + " lagi makan.");
    }

    public void makan(String makanan) {
        System.out.println(nama + " lagi makan " + makanan + ".");
    }

    public void infoHewan() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun.");
    }
}