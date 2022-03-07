package nowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Obslugapliku {
	public static void main(String[] args) throws FileNotFoundException {
	
	File plik = new File("dm.txt");
		
Scanner sc = new Scanner(plik);
int i = 0;

String s;

while(sc.hasNext())
	
	{
		sc.next();
		i++;
		
		
	}

	System.out.println(i);  

	
	}
}
