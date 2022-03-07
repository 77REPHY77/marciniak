package podstawy;

import java.util.Scanner;

public class HASAGI {
	
	public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
		
double liczba1, liczba2, liczba3;

System.out.println("wpisz liczbê 1");
liczba1 = sc.nextDouble();

System.out.println("wpisz liczbê 2");
liczba2 = sc.nextDouble();

System.out.println("wpisz liczbê 3");
liczba3 = sc.nextDouble();
	
if (liczba1<liczba2 && liczba1<liczba3)  System.out.println(liczba1);

else if (liczba2<liczba1 && liczba2<liczba3) System.out.println(liczba2);

else if (liczba3<liczba1 && liczba3<liczba2) System.out.println(liczba3);

		
		
		
		
		
		
		
	}
}
