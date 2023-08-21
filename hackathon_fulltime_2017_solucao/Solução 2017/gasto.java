import java.util.Scanner;


public class gasto {

	public static void main(String[] args) {
		int tempo, vel;
		float litros;
		Scanner read = new Scanner(System.in);
		tempo = read.nextInt();
		vel = read.nextInt();
		
		litros = (tempo*vel)/12f;
		System.out.printf("%.3f\n",litros);


	}

}
