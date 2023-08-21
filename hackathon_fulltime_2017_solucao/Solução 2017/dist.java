import java.util.Scanner;


public class dist {

	public static void main(String[] args) {
		float x1, y1, x2, y2, distancia;
		Scanner read = new Scanner(System.in);
		x1 = read.nextFloat();
		y1 = read.nextFloat();
		x2 = read.nextFloat();
		y2 = read.nextFloat();
		distancia = (float) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.printf("%.4f\n",distancia);
	}

}
