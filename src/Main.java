import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            array.add(random.nextInt(0, 100));
        }
        System.out.println("Все числа массива: ");
        System.out.print(array + " " + "\n");

        ArrayList<Integer> even = new ArrayList<>();
        for (Integer integer : array) {
            if (integer % 2 == 0) {
                even.add(integer);
            }
        }
        System.out.println("\nЧётные числа: ");
        System.out.println(even + " ");

        ArrayList<Integer> odd = new ArrayList<>();
        for (Integer integer : array) {
            if (integer % 2 != 0) {
                odd.add(integer);
            }
        }
        System.out.println("\nНе чётные числа: ");
        System.out.println(odd + " ");

    }
}
