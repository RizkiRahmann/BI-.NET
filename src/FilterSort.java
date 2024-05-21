import java.util.ArrayList;
import java.util.Arrays;

public class FilterSort {
    public static void main(String[] args) {
        int[] n = {12, 9, 13, 6, 10, 4, 7, 2};

        ArrayList<Integer> result = new ArrayList<>();

        for (int angka : n) {
            if (angka % 3 != 0) {
                result.add(angka);
            }
        }

        // Arraylist menjadi Array
        int[] sorted = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sorted[i] = result.get(i);
        }

        // Mengurutkan array 'sorted' secara ascending
        Arrays.sort(sorted);

        // Menampilkan hasil
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i]);
            if (i < sorted.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
