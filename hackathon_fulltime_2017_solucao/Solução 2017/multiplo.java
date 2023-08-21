import java.util.Scanner;


public class multiplo {

	public static void main(String[] args) {
		int A, B, soma=0;
		Scanner read = new Scanner(System.in);
		A = read.nextInt();
		B = read.nextInt();
		
		while (A>0)
		{
			soma+=A%10;
			A/=10;
		}
		if (soma%B==0)
			System.out.println("eh multiplo");
		else
			System.out.println("nao eh multiplo");

	}

}
