package bai6;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng : ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        int index = 0;
        while (index < array.length) {
            System.out.print("Nhập vào phần từ của mảng: ");
            array[index] = scanner.nextInt();
            index++;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();

        System.out.print("Nhập vào phần tử mà bạn muốn xóa : ");
        int removeElement = scanner.nextInt();

        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == removeElement) {
                flag = true;
                for (int j = i ; j < array.length - 1 ; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        if (!flag) {
            System.out.println("Phần từ bạn muốn xóa không có trong mảng");
        }

        System.out.println("Mảng sau khi xóa :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
