package bai14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuối của bạn : ");
        String str = scanner.nextLine();

        System.out.println("Nhập vào ký tự muốn đếm : ");
        Character ch = scanner.next().charAt(0);

        int count =0;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }

        System.out.println("Số lần xuất hiện ký tự "+ ch + "trong chuỗi là : " + count);
    }
}
