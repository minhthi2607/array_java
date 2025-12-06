package bai11;

import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Nhập vào số lượng sinh viên : ");
            size = scanner.nextInt();

            if (size > 30) {
                System.out.println("Không được vượt quá 30 học sinh");
            }
        } while (size > 30);
        int[] array = new int[size];

        int index = 0;
        while (index < array.length) {
            System.out.print("Nhập vào điểm của sinh viên: ");
            array[index] = scanner.nextInt();
            index++;
        }
        System.out.println("Danh sách điểm sinh viên: ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Số lượng sinh viên qua môn là : " + count);
    }
}
