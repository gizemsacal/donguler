import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //döngüler bir programda birbirine benzeyen işlemleri tekrarlamaya yarar.
        //For Döngüsü
        for (int i = 1; i < 10; i++) {
            /* i++ i'yi bir arttır demek. i++ ile i+1 arasında hiçbir fark yoktur.*/
            System.out.println(i);
            /*for  içindeki kısım şu şekilde açıklanır; i=1 kısmı sayaçtır. yani
            sayacımız 1 den başlıyor demektir, i<10 ise şart kısmıdır. i 10dan küçük
            olduğu sürece diye okunur. ve son kısım i++
             */

        }
        System.out.println("For Döngü bitti.");
        System.out.println("----------------");
        /* Eğer tek sayıların olmasını isteseydim i+=2 diyecektik.*/


        //While Döngüsü

        /*Aynı for döngüsü gibi belirli bi şart sağlanana kadar işlemi yapmaya yarar. For döngüsüyle
        yaabildiğiniz her şeyi While döngüsüyle de hemen hemen yapabilirsiniz.
         */
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        /*infinite loop= sonsuz döngü Eğer bir şart koymazsak sonsuz döngüye
        girer. arttırma işlemi vermediği için sürekli 1 çıkar 1 10 dan küçük mü
        evet 1 10 dan küçük mü evet....
        koymamız gerekiyor.
         */
        System.out.println("While Döngüsü Bitti.");
        //For döngüsü, yineleme sayısı bilindiğinde kullanılabilir.
        // While döngüsü, yineleme sayısı bilinmediğinde kullanılabilir.
        //Do-While Döngüsü
        int j=100;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Bitti");
        /*şart uymasa bile do _ while'da 1 kere çalışacaktır.*/

          }
    }