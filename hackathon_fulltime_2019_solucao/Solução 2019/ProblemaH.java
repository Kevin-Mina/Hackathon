import java.util.Scanner;


public class ProblemaH {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N, i, cod, qtd;
		float total=0;
		N=entrada.nextInt();
		
		for (i=0;i<N;i++)
		{
			cod=entrada.nextInt();
			qtd=entrada.nextInt();
			switch (cod)
			{
			case 1001: total+=qtd*1.5f; break;
			case 1002: total+=qtd*2.5f; break;
			case 1003: total+=qtd*3.5f; break;
			case 1004: total+=qtd*4.5f; break;
			case 1005: total+=qtd*5.5f; break;
			}
		}
		
		System.out.printf("%.2f",total);

	}

}
