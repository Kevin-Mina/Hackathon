import java.util.Scanner;


public class bissexto {

	public static void main(String[] args) {
		int ano;
		Scanner read = new Scanner(System.in);
		ano = read.nextInt();
		if (ano%400==0 || ano%4==0 && ano%100!=0)
		{
			System.out.print("Ano Bissexto");
			if (ano%15==0)
				System.out.print(" -> Huluculu");
			if (ano%55==0)
				System.out.print(" -> Bulukulu");
			System.out.println();
		}
		else
			System.out.println("Ano Comum");
	}

}
