package bai10;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào kích thước của mảng : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int index = 0;
        while (index < array.length){
            System.out.print("Nhập vào phần tử của mảng : ");
            array[index] = scanner.nextInt();
            index++;
        }

        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Phần tử nhor nhất trong mảng là : " + min + "");

    }
}
