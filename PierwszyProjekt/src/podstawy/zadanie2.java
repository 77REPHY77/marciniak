package podstawy;

import java.util.Scanner;

public class zadanie2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("oblicz pole trójk¹ta");
		
		System.out.println("podaj wysokoœæ trójk¹ta");
		
			double wysokosc= sc.nextDouble();
			
			System.out.println("podaj podstawe trójk¹ta");
			
			double podstawa= sc.nextDouble();
			double pole=wysokosc*podstawa/2;
			System.out.println(pole);
}
}
