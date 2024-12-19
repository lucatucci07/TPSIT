import java.util.Arrays;

public class es8 {
    public static void main(String[] args) {
        int[] primoArray = {4, 8, 15, 16};
        int[] secondoArray = Arrays.copyOf(primoArray, primoArray.length);
        System.out.println(Arrays.equals(primoArray, secondoArray) ? "I due array sono identici." : "I due array non sono identici.");
    }
}




