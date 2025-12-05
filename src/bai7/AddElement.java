package bai7;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 5; i++) {
            array[i] = i + 2;
        }
        System.out.println("Mảng ban đầu :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        System.out.print("Nhập số cần chèn: ");
        int element = scanner.nextInt();

        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();
        if (index < 0 || index >= array.length){
            System.out.print("Không chèn được phần tử vào mảng");
            return;
        }

        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;

        System.out.println("Mảng sau khi được chèn: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
