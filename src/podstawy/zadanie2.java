package podstawy;

import java.util.Scanner;

public class zadanie2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("oblicz pole tr�jk�ta");
		
		System.out.println("podaj wysoko�� tr�jk�ta");
		
			double wysokosc= sc.nextDouble();
			
			System.out.println("podaj podstawe tr�jk�ta");
			
			double podstawa= sc.nextDouble();
			double pole=wysokosc*podstawa/2;
			System.out.println(pole);
}
}
