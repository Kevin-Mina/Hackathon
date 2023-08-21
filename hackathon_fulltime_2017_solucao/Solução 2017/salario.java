import java.util.Scanner;


public class salario {

	public static void main(String[] args) {
		int num, horas;
		float valor_hora, salario;
		Scanner read = new Scanner(System.in);
		num = read.nextInt();
		horas = read.nextInt();
		valor_hora = read.nextFloat();
		
		salario = horas*valor_hora;
		System.out.printf("NUMBER = %d\n",num);
		System.out.printf("SALARY = U$ %.2f\n",salario);

	}

}
