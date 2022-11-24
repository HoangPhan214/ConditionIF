package Basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 9.1 Viet chuong trinh nhap vao mot so nguyen n. Kiem tra
		 * so do la nguyen am hay nguyen duong. In ra man hinh
		 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0) {
        	System.out.println("Day la so nguyen duong");
        }else {
        	if(n |= 0) {
        		System.out.println("Day la so nguyen am");
        	}
        }
        
        /**
         * 9.2 Viet chuong trinh nhap vao mot so nguyen n. Kiem tra
         * n chia het cho 3 hay 5
         */
        if(n % 3 == 0) {
        	System.out.format("%d chia het cho 3=, n");
        }
        if(n % 5 == 0) {
        	System.out.format("%d chia het cho 5=, n");
        }
        
        /**
         * 9.3 Viet chuong trinh nhap vao mot so nguyen n la thang trong nam.
         * In ra so ngay cua thang do
         */
        if(n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
        	System.out.println("Thang co 31 ngay");
        }
        if(n == 4 || n == 6 || n == 9 || n == 11) {
        	System.out.println("Thang co 30 ngay");
        }
        if(n == 2) {
        	System.out.println("Thang co 28 ngay");
        }
        
        /**
         * 9.5 Viet chuong trinh nhap vao 3 so a, b, c. Kiem tra 3 so do la
         * 3 canh cua tam giac phai khong
         */
        System.out.println("Canh a");
        int a = sc.nextInt();
        
        System.out.println("Canh b");
        int b = sc.nextInt();
        
        System.out.println("Canh c");
        int c = sc.nextInt();
        
        if(a + b > c && a + c > b && b + c > a) {
        	System.out.println("Day la 3 canh cua 1 tam giac");
        }else {
        	System.out.println("Day khong phai la 3 canh cua 1 tam giac");
        }
        
	}

}
