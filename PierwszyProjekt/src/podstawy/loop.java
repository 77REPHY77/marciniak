package podstawy;

import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

System.out.println("wpisz liczb� liczb do wy�wietlenia");
		
double suma = 0;

double licznik = 0;

double liczba1 = sc.nextDouble();

while(licznik  <= liczba1) 
{
	System.out.println("  Podaj kojejn� warto��");
	double liczba2 = sc.nextDouble();
suma = suma + liczba2;


licznik ++;
}
System.out.println("suma:" + suma );


}
}