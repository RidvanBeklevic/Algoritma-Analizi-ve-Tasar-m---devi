import java.util.Random;
public class QuickSortileRastgeleDiziSiralama {

        public static void main(String[] args) {
            int boyut = 10000;
            int[] dizi = new int[boyut];
            Random r = new Random();
            for (int i = 0; i < boyut; i++) {
                dizi[i] = r.nextInt(10000);
            }
            long baslangicZamani = System.currentTimeMillis();
            quickSort(dizi, 0, boyut - 1);
            long bitisZamani = System.currentTimeMillis();
            System.out.println("Programın Çalışma Süresi: " + (bitisZamani - baslangicZamani) +" " +"ms");
        }

        public static void quickSort(int[] dizi, int sol, int sag) {
            if (sol < sag) {
                int pivotIndex = BolmeIslemi(dizi, sol, sag);
                quickSort(dizi, sag, pivotIndex - 1);
                quickSort(dizi, pivotIndex + 1, sag);
            }
        }

        public static int BolmeIslemi(int[] dizi, int sol, int sag) {
            int pivot = dizi[sag];
            int i = sol - 1;
            for (int j = sol; j < sag; j++) {
                if (dizi[j] < pivot) {
                    i++;
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
            int gecici = dizi[i + 1];
            dizi[i + 1] = dizi[sag];
            dizi[sag] = gecici;
            return i + 1;
        }

    }


