import java.util.Scanner;

public class Trabajo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int a = 0;
		int b = 0;
		double c = 0;
		
		System.out.print("ingrese el primer numero");
		a=obj.nextInt();
		System.out.print("ingrese el segundo numero");
		b=obj.nextInt();
		
		c = a + b;
		System.out.print("\nLa suma es: " + a +"+" + b + "=" + c);
		
		c = a - b;
		System.out.print("\nLa resta es: " + a +"-" + b + "=" + c);
		
		c = a * b;
		System.out.print("\nLa multiplicación es: " + a + "*" + b + "=" + c);
		
		c = (double) a / (double) b;
		System.out.print("\nLa división es: " + a + "/" + b + "=" + c);
		
	}

}
