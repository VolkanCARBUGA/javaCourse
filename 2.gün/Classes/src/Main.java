public class Main {
    public static void main(String[] args) {
       CustomerManager  customerManager=new CustomerManager();
//       customerManager.add();
//       customerManager.update();
//       customerManager.delete();
       int sayı1=10;
       int sayı2=20;
       sayı2=sayı1;
       sayı1=30;
        //System.out.println(sayı2);
        int[] sayılar=new int[]{1,2,3};
        int[] sayılar2=new int[]{4,5,6};
        sayılar2=sayılar;
        sayılar[0]=10;
        System.out.println(sayılar2[0]);

    }
}
