package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,y,soma;
		
		System.out.println("Insert two number: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("The sum of the two numbers is = " +soma);

        sc.close();
        
	}

}
