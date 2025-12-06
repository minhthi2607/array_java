package bai9;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng : ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột :");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                System.out.print("Nhâp vào giá trị: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Danh sách mảng 2 chiều : ");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int max = array[0][0];
        int maxCol = 0;
        int maxRow = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxCol = j;
                    maxRow = i;
                }
            }
        }

        System.out.print("Phần tử có giá trị lớn nhất trong mảng 2 chiều là : " + max);
        System.out.println();
        System.out.print("Vị trí là : " + (maxRow ) + " , " + (maxCol));


    }
}
