import java.util.Scanner;


public class ProblemaB {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N, i, cont=0;
		float media=0, perc;
		N=entrada.nextInt();
		int medias[] = new int[N];
		for (i=0;i<N;i++)
		{
			medias[i]=entrada.nextInt();
			media+=medias[i];
		}
		media/=N;
		for (i=0;i<N;i++)
		{
			if (medias[i]>media)
				cont++;
		}
		perc=(cont*100f)/N;
		System.out.printf("%.3f%%",perc);
		

	}

}
