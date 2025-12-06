package bai13;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng : ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột :");
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                System.out.print("Nhâp vào giá trị: ");
                array[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Danh sách mảng 2 chiều : ");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        double sum =0 ;
         for (int i = 0; i < array.length ; i++) {
             for (int j = 0; j < array[i].length ; j++) {
                 if(i == j){
                     sum += array[i][j];
                 }
             }
         }
        System.out.println();
        System.out.print("Tổng đường chéo chính là : " + sum + "");
    }
}
