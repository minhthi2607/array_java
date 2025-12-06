package bai12;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng : ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột :");
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhâp vào giá trị: ");
                array[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Danh sách mảng 2 chiều : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Nhập vào cột muốn tính tổng : ");
        int column = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        System.out.println("Tổng của cột " + column + " là : " + sum);


    }
}
