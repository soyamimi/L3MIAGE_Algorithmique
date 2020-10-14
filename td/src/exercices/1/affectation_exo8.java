package td1;
import java.util.Scanner;
/*Un ticket poss�de un nombre de 6 chiffres qui va de 000000 � 999999. Un ticket est dit
chanceux si la somme des trois premiers chiffres est �gale � la somme des trois derniers
chiffres. Dire si un ticket est chanceux. 
*/


public class affection_exo8 {
	static Scanner sc = new Scanner(System.in);
	
	static int TicketChanceux (int n) {
		int a = n/100;
		int b = (n%100) / 10;
		int c = n%10;
		
		return a+b+c;
		
	}
	
	
	public static void main (String arg[]) {
		int n= sc.nextInt();
		int gauche = n/1000;
		int droite= n%1000;
		if (TicketChanceux(gauche)==TicketChanceux(droite)) {
			System.out.println("Chanceux");
		}
		else {
			System.out.println("Pas de chance");
		}
			
		};		
	}
	
	
		
		
		
		
		
