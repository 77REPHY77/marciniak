package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class sklep {
public static void main(String[] ags) throws FileNotFoundException {

			
	
			
			File plik = new File("Sklep");		
			Scanner sc = new Scanner(plik);
			int suma= 0;
			while (sc.hasNextLine()) {
		System.out.println(sc.next()+" "+sc.nextInt()+sc.nextInt());	
		suma += sc.nextInt() * sc.nextInt();
			
			
			

	
	
	
}
}}
