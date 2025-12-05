package bai1;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size;
        do{
            System.out.print("Enter the size : ");
            size = scanner.nextInt();
            if(size > 20 ){
                System.out.println("Size is greater than 20");
            }
        }while(size > 20);

        int[] array  = new int[size];
        int i =0;
        while(i<array.length){
            System.out.print("Enter the element " + (i +1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: " ,"");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for(int j = 0;j < array.length /2 ;j++){
            int temp = array[j];
            array[j] = array[array.length - j-1];
            array[size-j-1] = temp;
        }
        System.out.println();
        System.out.printf("%-20s%s", "Reverse array: " ,"");
        for (int j = 0 ; j < array.length ; j++){
            System.out.print(array[j] + "\t");
        }

    }
}
