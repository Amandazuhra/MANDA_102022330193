public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan\n");

        Kucing kucing = new Kucing("Abu", 1, "Persia");
        System.out.println("ini adalah " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("Ayam");
        kucing.infoHewan();
        System.out.println();

        Burung burung = new Burung("Ocong", 1, "Putih");
        System.out.println("ini adalah " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("Jagung");
        burung.infoHewan();
    }
}