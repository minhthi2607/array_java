package bai5;

import java.util.Scanner;

public class NumberArray {

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Nhập vào độ dài của mảng : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Độ dài không được vượt quá 20");
            }
        } while (size > 20);

        int i = 0;
        int[] array = new int[size];
        while (i < array.length) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Phần tử có giá trị nhỏ nhất trong mảng là : " + minValue(array));
        scanner.close();
    }
}
