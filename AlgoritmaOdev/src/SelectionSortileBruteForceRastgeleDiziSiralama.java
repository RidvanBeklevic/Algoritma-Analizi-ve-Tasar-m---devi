public class SelectionSortileBruteForceRastgeleDiziSiralama {
        public static void main(String[] args) {
            int[] dizi = new int[10000];
            for (int i = 0; i < dizi.length; i++) {
                dizi[i] = (int) (Math.random() * 10000);
            }


            long baslangicZamani = System.currentTimeMillis();

            selectionSort(dizi);
//            System.out.println("\n");
//            diziyiYazdir(dizi);
            long bitisZamani = System.currentTimeMillis();
            System.out.println("Programın Çalışma Süresi: " + (bitisZamani - baslangicZamani) +" " +"ms");


        }

        public static void selectionSort(int[] dizi) {
            for (int i = 0; i < dizi.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < dizi.length; j++) {
                    if (dizi[j] < dizi[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = dizi[minIndex];
                dizi[minIndex] = dizi[i];
                dizi[i] = temp;
            }
        }

        public static void diziyiYazdir(int[] dizi) {
            for (int i = 0; i < dizi.length; i++) {
                System.out.print(dizi[i] + " ");
            }
        }
    }


