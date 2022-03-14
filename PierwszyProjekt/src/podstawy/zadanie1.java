package podstawy;

import java.util.Scanner;

public class zadanie1 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
				
		System.out.println("Oblicz pole rombu");
				
		System.out.println("wpisz d³ugoœæ boku");
		
		double bok= sc.nextDouble();
		
		System.out.println("podaj wysokoœæ");
		
		double wysokosc= sc.nextDouble();
		
		
				double pole=wysokosc*bok; 
				
				System.out.println(pole);
	}
}
