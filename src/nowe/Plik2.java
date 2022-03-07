package nowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Plik2 {
	public static void main(String[] args) throws FileNotFoundException {	
	File plik = new File("321.txt");
	
Scanner sc = new Scanner(plik);
int i =0;
int liczba;

while(sc.hasNext()) {
	
liczba=  sc.nextInt();
if(liczba ==4)i++;

}
System.out.println(i);
}
}
