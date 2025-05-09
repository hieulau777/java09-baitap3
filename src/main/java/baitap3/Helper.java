package baitap3;

import java.util.Scanner;

public class Helper {
    public static int checkInteger(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                return value;
            } else {
                System.out.println("Giá trị nhập vào không phải là số nguyên. Vui lòng nhập lại.");
                scanner.next();
            }
        }
    }
    public static double checkDouble(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                return value;
            } else {
                System.out.println("Giá trị nhập vào không phải dạng số. Vui lòng nhập lại.");
                scanner.next();
            }
        }
    }
    public static int checkSoHangChuc(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value >= 10 && value <= 99) {
                    return value;
                } else {
                    System.out.println("Vui lòng nhập số nguyên có 2 chữ số (từ 10 đến 99).");
                }
            } else {
                System.out.println("Giá trị nhập vào không phải là số nguyên. Vui lòng nhập lại.");
                scanner.next();
            }
        }
    }
}
