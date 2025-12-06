package bai8;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng A : ");
        int sizeA = scanner.nextInt();
        int indexA = 0;
        int[] arrayA = new int[sizeA];
        while (indexA < sizeA) {
            System.out.print("Nhập phần tử thứ " + indexA + " vào mảng A: ");
            arrayA[indexA] = scanner.nextInt();
            indexA++;
        }

        System.out.println();
        System.out.print("Nhập kích thước của mảng B :");
        int sizeB = scanner.nextInt();
        int indexB = 0;
        int[] arrayB = new int[sizeB];
        while (indexB < sizeB) {
            System.out.print("Nhập phần tử thứ " + indexB + " vào mảng B: ");
            arrayB[indexB] = scanner.nextInt();
            indexB++;
        }

        System.out.println();
        System.out.println("Danh sách mảng A");
        for (int a : arrayA) {
            System.out.print(a + "\t");
        }

        System.out.println();
        System.out.println("Danh sách mảng B: ");
        for (int b : arrayB) {
            System.out.print(b + "\t");
        }
        System.out.println();
        int[] mergedArray = new int[sizeA + sizeB];
        for (int i = 0; i < arrayA.length; i++) {
                mergedArray[i] = arrayA[i];
        }
        for (int j = 0; j < arrayB.length; j++) {
            mergedArray[arrayA.length + j] = arrayB[j];
        }
        System.out.println("Mảng sau khi được gộp : ");
        for (int element : mergedArray) {
            System.out.print(element + "\t");
        }


    }
}
