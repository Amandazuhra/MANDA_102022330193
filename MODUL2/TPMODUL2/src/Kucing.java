public class Kucing extends Hewan{
    String nama;
    private int umur;
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        this.nama = nama;
        this.umur = umur;
        this.ras = ras;
    }

    public void suara() {
        System.out.println(nama + " miaw.");
    }

    public void makan() {
        System.out.println(nama + " lagi makan.");
    }

    public void makan(String makanan) {
        System.out.println(nama + " lagi makan " + makanan + ".");
    }

    public void infoHewan() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun.");
        System.out.println("Ras: " + ras);
    }
}