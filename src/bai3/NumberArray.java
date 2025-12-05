package bai3;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập vào kích thước : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước không được vượt quá 20");
            }
        } while (size > 20);

        int[] array = new int[size];
        int i =0;
        while (i < array.length) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Danh sách phần từ : ");
        for(int element : array) {
            System.out.print(element + "\t");
        }

        int max =  array[0];
        int index = 1;
        for (int j = 0; j < array.length ; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println();

        System.out.println("Phân từ lớn nhất trong danh sách là : " + max + " và vị trí của phần từ là : " + index);

        scanner.close();
    }
}
