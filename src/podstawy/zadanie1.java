package podstawy;

import java.util.Scanner;

public class zadanie1 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
				
		System.out.println("Oblicz pole rombu");
				
		System.out.println("wpisz d�ugo�� boku");
		
		double bok= sc.nextDouble();
		
		System.out.println("podaj wysoko��");
		
		double wysokosc= sc.nextDouble();
		
		
				double pole=wysokosc*bok; 
				
				System.out.println(pole);
	}
}
