import java.util.Scanner;


public class ProblemaA {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, y;
		x=entrada.nextInt();
		y=entrada.nextInt();
		for (int i=1;i<=y;i++)
			if (i%x==0)
				System.out.println("PIM");
			else
				System.out.print(i+" ");
	}

}
