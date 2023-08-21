import java.util.Scanner;

public class ProblemaG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int f1 = scanner.nextInt();
		int f2 = scanner.nextInt();
		int menor, i=0;
		if (f1<f2)
			menor=f1;
		else
			menor=f2;
		for (i = menor; i >= 0; i--)
			if (f2 % i == 0 && f1 % i == 0)
				break;

		System.out.println(i);

	}

}
