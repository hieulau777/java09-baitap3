package baitap3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Cạnh huyền: " + tinhCanhHuyen(3, 4));

        System.out.println("2. Đơn thức ax^n với a=2, x=8, n=3: " + tinhDonThuc(2, 3, 8));

        int n = Helper.checkSoHangChuc("3. Nhập số nguyên 2 chữ số: ", scanner);
        System.out.println("Tổng 2 chữ số: " + tongHaiChuSo(n));

        System.out.println("4. Nhập 5 số để tính trung bình:");
        double[] numbers = new double[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Helper.checkDouble("Số thứ " + (i + 1) + ": ", scanner);
        }
        System.out.println("Trung bình: " + tinhTrungBinh(numbers));

        double doC = Helper.checkDouble("5. Nhập độ C: ", scanner);
        System.out.println("Độ F: " + transferCtoF(doC));

        double usd = Helper.checkDouble("6. Nhập số USD: ", scanner);
        System.out.println("Quy đổi sang VND: " + transferUsdToVNd(usd) + "đ");

        scanner.close();

	}
	
    // 1. Tính cạnh huyền tam giác vuông
    public static double tinhCanhHuyen(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    // 2. Tính giá trị đơn thức P(x) = a * x^n
    public static double tinhDonThuc(double a, int n, double x) {
        return a * Math.pow(x, n);
    }

    // 3. Tổng hai chữ số của số nguyên dương có 2 chữ số
    public static int tongHaiChuSo(int n) {
        int hangChuc = n / 10;
        int hangDonVi = n % 10;
        return hangChuc + hangDonVi;
    }

    // 4. Tính trung bình của 5 số
    public static double tinhTrungBinh(double[] numbers) {
        final int COUNT = 5;
        double tong = 0;
        for (double num : numbers) {
            tong += num;
        }
        return tong / COUNT;
    }

    // 5. Đổi độ C sang độ F
    public static double transferCtoF(double doC) {
        return (doC * 1.8) + 32;
    }

    // 6. Quy đổi USD sang VND
    public static double transferUsdToVNd(double usd) {
        final double TI_GIA = 23500;
        return usd * TI_GIA;
    }

}
