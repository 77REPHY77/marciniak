package nowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Plik3 {
	public static void main(String[] args) throws FileNotFoundException {
		
		File plik = new File("231.txt");
		
		Scanner sc = new Scanner(plik);
		
		int i =0;
		
		int liczba;
		
		int eg =0;
		
		int fe =0;
		
		while(sc.hasNext()) {
			
		liczba=  sc.nextInt();
		if(liczba ==4)i++;
		if(liczba ==6)fe++;
		if(liczba ==5)eg++;
		}
		System.out.println("liczba 4 =" );
		System.out.println(i);
		
		System.out.println("liczba 5 =");
		System.out.println(eg);
		
		System.out.println("liczba 6 =" );
		System.out.println(fe);
		
		
		
	}
}
