import java.util.Scanner;


public class area {

	public static void main(String[] args) {
		float pi=3.14159f, raio, area;
		Scanner read = new Scanner(System.in);
		raio = read.nextFloat();
		
		area = pi*raio*raio;
		System.out.printf("%.2f\n",area);

	}

}
