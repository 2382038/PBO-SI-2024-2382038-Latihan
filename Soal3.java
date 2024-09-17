public class Soal3 {
    public static void main(String[] args) {
        String kata = "saveChangesInTheEditor";
        int jumlah = 1;
        for (int i = 0; i < kata.length(); i++){
            if (Character.isUpperCase(kata.charAt(i))){
                jumlah++;
            }
        }
        System.out.println("Jumlah Kata dalam camelCase: " + jumlah);
    }
}
