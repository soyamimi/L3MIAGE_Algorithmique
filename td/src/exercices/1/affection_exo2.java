package td1;
import java.util.Scanner;
//Ecrire un programme qui permute 2 variables enti�res sans variable auxiliaire.

public class affection_exo2 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		PermuteSansAux();		
	}
	
	static void PermuteSansAux () {
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		x=x+y;
		y=x-y;
		x=x-y;
	
		
		System.out.println("x = "+ x + ", y = " + y);
	}
}
