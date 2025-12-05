package bai2;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập tên học sinh cần tìm : ");
        String name = scanner.nextLine();

        boolean isExits = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí của học sinh " + name + " trong danh sách là : " + i);
                isExits = true;
                break;
            }
        }
        if (!isExits) {
            System.out.println("Không tìm thấy học sinh " + name + " trong danh sách");
        }
        scanner.close();

    }
}
