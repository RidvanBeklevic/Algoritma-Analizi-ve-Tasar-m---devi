import java.util.Random;

public class BruteForceRastgeleDizi {


        public static void main(String[] args) {



            int dizi[] = new int[10000];

            Random r = new Random();

            for (int i=0;i<dizi.length;i++){
                dizi[i]=r.nextInt(10000);
            }
            long baslangicZamani = System.currentTimeMillis();
            //DiziyiYazdir(dizi);

            BrutDizininEnBuyugu(dizi);
            long bitisZamani = System.currentTimeMillis();
            long gecensure = bitisZamani - baslangicZamani;
            System.out.println();
            System.out.println("Programın çalışma süresi: " + gecensure + " ms");
        }



        public static int BrutDizininEnBuyugu(int dizi[]){



            int enbuyuk = dizi[0];
            for (int i = 0; i < dizi.length; i++) {
                for (int j = i + 1; j < dizi.length; j++) {
                    if (dizi[j] > enbuyuk) {
                        enbuyuk = dizi[j];

                    }
                }
            }

            System.out.println("\n");
            System.out.println("Dizinin en buyuk elemani = "+enbuyuk);

            return enbuyuk;

        }


        public static void DiziyiYazdir(int dizi[]){
            for (int i=0;i<dizi.length;i++){
                System.out.println("Dizinin "+(i+1)+". elemanı = "+dizi[i]);
            }
        }



    }

