package tirupathi;

import java.util.Scanner;

public class UniaryOperator {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a value : ");
		a=n.nextInt();
		System.out.println("Enter b value : ");
		b=n.nextInt();
		System.out.println("a value is "+ a);
		System.out.println("b value is "+ b);
		System.out.println("biggest number is "+ (a<b?b:a));

	}

}
