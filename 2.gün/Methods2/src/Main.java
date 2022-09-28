public class Main {
    public static void main(String[] args) {
topla2(1,2,3,4,5,6,7,8,9,10);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }
    public static int topla(){

        
        return 5;

    }
    public static void topla2(int... sayı){
        int toplam=0;
        for (int sayım:sayı){
            toplam+=sayım;
        }
        System.out.println(toplam);
    }
}