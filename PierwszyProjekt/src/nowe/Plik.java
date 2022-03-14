package nowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Plik {
	public static void main(String[] args) throws FileNotFoundException {
		
		File plik = new File("123.txt");
		
		Scanner sc = new Scanner(plik);
		
		double suma = 0;		
		
		double liczba;
		
	while(sc.hasNext())
		{
		
		liczba= sc.nextDouble();
		
		suma = suma + liczba;
		}
		
		System.out.println(suma);
	}
}
