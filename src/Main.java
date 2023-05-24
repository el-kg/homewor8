import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        //System.out.println("Задание 1");
        int[] massiv1 = new int[3];
        massiv1[0] = 1;
        massiv1[1] = 2;
        massiv1[2] = 3;
        double[] massiv2 = {1.57, 7.654, 9.986};
        double[] massiv3 = {2.22, 3.33, 4.44, 5.55};
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < massiv1.length; i++) {
            System.out.print(massiv1[i]);
            if (i < massiv1.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = 0; i < massiv2.length; i++) {
            System.out.print(massiv2[i]);
            if (i < massiv2.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = 0; i < massiv3.length; i++) {
            System.out.print(massiv3[i]);
            if (i < massiv3.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        // Задание 3
        System.out.println("Задание 3");
        int massiv1Size = massiv1.length;
        for (int i = massiv1Size - 1; i >= 0; i -= 1) {
            System.out.print(massiv1[i]);
            if (i >= 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        int massiv2Size = massiv2.length;
        for (int i = massiv2Size - 1; i >= 0; i -= 1) {
            System.out.print(massiv2[i]);
            if (i >= 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        int massiv3Size = massiv3.length;
        for (int i = massiv3Size - 1; i >= 0; i -= 1) {
            System.out.print(massiv3[i]);
            if (i >= 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        // Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < massiv1.length; i++) {
            if (massiv1[i] % 2 != 0) {
                massiv1[i]++;
            }
        }
        System.out.println(Arrays.toString(massiv1));
    }
}
