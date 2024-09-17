public class Soal1 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int jumlah = 0;
        for(int i = 0; i < ar.length; i++){
            jumlah+=ar[i];
        }System.out.println("Jumlah elemen array: " + jumlah);
    }
}
