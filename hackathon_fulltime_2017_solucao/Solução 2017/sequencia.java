import java.util.Scanner;


public class sequencia {

	public static void main(String[] args) {
		int X, i;
		Scanner read = new Scanner(System.in);
		X = read.nextInt();
		for (i=1;i<=X;i++)
		{
			if (i<X)
				System.out.print(i+" ");
			else
				System.out.println(i);
		}
		

	}

}
