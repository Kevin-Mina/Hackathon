import java.util.Scanner;

public class ProblemaC {

	public static int pag(int m, int n) {
		if (m == 0) 
			return n + 1;
		if (n == 0) 
			return pag(m - 1, 1);
		return pag(m - 1, pag(m, n - 1));	
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println(pag(m, n));
	}

}
