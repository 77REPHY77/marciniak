package podstawy;

import java.util.Scanner;

public class zadanieh {
	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

double a, b, c;

System.out.println("wpisz liczbê 1");
a= sc.nextDouble();

System.out.println("wpisz liczbê 2");
b= sc.nextDouble();	

System.out.println("wpisz liczbê 3");
c= sc.nextDouble();	

if (a>b && a>c && b>c) System.out.println(c + " " + b + " " + a);

else if (b>c && a>c && b>a) 
System.out.println(c +" "+ a +" "+b);

else if (b<c && a<c && b<a)
System.out.println(b+ " "+ a +" "+c);

else if (b<c && a<c && b>a) 
System.out.println(a+" "+ b +" "+c);

	else if (b<c && a<c && b<a) 
System.out.println(b+" "+ a+ " "+c);
else if (b<c && a>c && b<a) {
System.out.println(b+" "+ c + " "+a);}
	}	
}
