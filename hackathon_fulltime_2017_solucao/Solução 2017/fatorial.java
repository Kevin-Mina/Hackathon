import java.util.Scanner;


public class fatorial {

	public static void main(String[] args) {
		int M, N, f1=1, f2=1, i;
		Scanner read = new Scanner(System.in);
		M = read.nextInt();
		N = read.nextInt();
		
		for (i=1;i<=M;i++)
			f1*=i;
		for (i=1;i<=N;i++)
			f2*=i;
		System.out.println((f1+f2));

	}

}
