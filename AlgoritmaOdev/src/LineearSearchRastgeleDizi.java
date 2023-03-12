import java.util.Random;

public class LineearSearchRastgeleDizi {


        public static void main(String[] args) {



            int dizi[] = new int[10000];

            Random r = new Random();

            for (int i=0;i<dizi.length;i++){
                dizi[i]=r.nextInt(10000);
            }
            long baslangicZamani = System.currentTimeMillis();
            //DiziyiYazdir(dizi);

            DizininEnBuyugu(dizi);

            long bitisZamani = System.currentTimeMillis();
            long gecensure = bitisZamani - baslangicZamani;
            System.out.println("Programın çalışma süresi: " + gecensure + " ms");
        }




        public static int DizininEnBuyugu(int dizi[]){

            int enbuyuk;
            enbuyuk =dizi[0];

            for (int i=1;i<dizi.length;i++){
                if (dizi[i]>enbuyuk)
                    enbuyuk =dizi[i];
            }


            System.out.println("\n");
            System.out.println("Dizinin en buyuk elemani = "+enbuyuk);
            System.out.println("\n");

            return enbuyuk;
        }


        public static void DiziyiYazdir(int dizi[]){
            for (int i=0;i<dizi.length;i++){
                System.out.println("Dizinin "+(i+1)+". elemanı = "+dizi[i]);
            }
        }



    }

