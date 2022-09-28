public class Main {
    public static void main(String[] args) {
        int[] sayılar = new int[]{1, 2, 5, 7, 9, 0};
        int aranak = 8;
        boolean varMı = false;
        for (int sayı : sayılar) {
            if (aranak == sayı) {
                varMı = true;
            }
        }
        if (varMı) {
            mesajVer("Sayı Bulundu :" + aranak);
        } else {
            mesajVer("sayı bulunamadı");
        }

    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

}
