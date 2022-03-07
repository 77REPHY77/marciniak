package nowe;

import java.util.Random;
import java.util.Scanner;

public class zadaniea {
	public static void main(String[] args) {
	 
Scanner sc = new Scanner(System.in);



double tab [] = {1.2,10.2};

for(int k = 0;k<3;k++) {

System.out.println("wpisz liczbê ");

double a = sc.nextDouble();

tab [k]= a;
}	
System.out.println("wpisz liczbê z tablicy");
int liczba = sc.nextInt();

System.out.println(tab [ liczba ]);	




}
}
