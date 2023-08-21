import java.util.Scanner;


public class maior {

	public static void main(String[] args) {
		int a, b, c;
		Scanner read = new Scanner(System.in);
		a = read.nextInt();
		b = read.nextInt();
		c = read.nextInt();
		if (a>c && a>b)
			System.out.println(a+" eh o maior");
		else
			if (b>c)
				System.out.println(b+" eh o maior");
			else
				System.out.println(c+" eh o maior");
	}

}
