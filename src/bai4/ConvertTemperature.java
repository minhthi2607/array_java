package bai4;

import java.util.Scanner;

public class ConvertTemperature {

    public static double celsiusToFahrenheit(double celsius) {
        double f = (9.0 / 5.0) * celsius + 32.0;
        return f;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double c = (5 / 9.0) * (fahrenheit - 32.0);
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Lựa chọn của bạn :");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập vào độ F : ");
                    double f = scanner.nextDouble();
                    System.out.println("Chuyển đổi từ độ F sang độ C: " + fahrenheitToCelsius(f));
                    break;
                case 2:
                    System.out.println("Nhập vào độ C : ");
                    double c = scanner.nextDouble();
                    System.out.println("Chuyển đổi từ độ C sang độ F : " + celsiusToFahrenheit(c));
                    break;
                case 0:
                    System.exit(0);
                    scanner.close();
                default:
                    System.out.println("Lựa chọn không phù hợp!");
            }
        }
    }
}
