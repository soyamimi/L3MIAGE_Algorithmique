package td1;
//Calculer le ni�me terme de la suite de Fibonacci d�finie par : u0 = u1 = 1 et un = un-1 + un-2 (n � 2).

import java.util.Scanner;
public class boucle_exo6 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		fibo();		
	}


	static void fibo() {
	
	int x=sc.nextInt();
	int n1 = 0;
	int n2 = 1;
	int n3;
	System.out.print(n1 + " " + n2);
	
	for (int i=2; i<x;i++) {
		n3= n1+n2 ;
		System.out.print(" " +n3);
		n1=n2;
		n2=n3;
		}
	}

}	
