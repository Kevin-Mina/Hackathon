import java.util.Scanner;


public class ProblemaF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N, i, min=0;
		N=entrada.nextInt();
		int algoz[] = new int[N];
		for (i=0;i<N;i++)
		{
			algoz[i]=entrada.nextInt();
			if (algoz[i]<algoz[min])
				min=i;
		}
		
		System.out.print(""+(min+1));

	}

}
